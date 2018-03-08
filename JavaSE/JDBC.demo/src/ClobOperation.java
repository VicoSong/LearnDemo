import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;

import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.junit.Test;







/**
 * 该类主要实现对大文本数据的保存和读取
 * @author Administrator
 *
 */
public class ClobOperation {
	
	@Test
	public void saveClob() throws SQLException, FileNotFoundException
	{
		//获得连接对象
		Connection conn=JdbcUtils.getConnection();
		//获得预处理对象
		PreparedStatement pstmt=conn.prepareStatement("insert into bigtext values(?,?)");
		pstmt.setString(1, "1");
		File file=new File("src/原创诗歌.txt");
		FileReader reader=new FileReader(file);
		pstmt.setCharacterStream(2, reader,(int)file.length());
		//执行sql语句
		pstmt.executeUpdate();
		JdbcUtils.release(null, pstmt, conn);
	}
	
	@Test
	public void QueryClob() throws SQLException, Exception
	{
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM bigtext");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("id");
			Reader rd=rs.getCharacterStream("txt");
			File f=new File("src/a.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter(f));
			BufferedReader  br=new BufferedReader(rd);
			String s="";
			while((s=br.readLine())!=null)
			{
				bw.write(s);
				bw.newLine();
			}
			br.close();
			bw.close();
		}
		JdbcUtils.release(null, pstmt, conn);
	}
}
