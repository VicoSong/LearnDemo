import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;







/**
 * 该类主要实现对二进制数据的保存和读取
 * @author Administrator
 *
 */
public class BlobOperation {
	
	@Test
	public void saveBlob() throws SQLException, FileNotFoundException
	{
		//获得连接对象
		Connection conn=JdbcUtils.getConnection();
		//获得预处理对象
		PreparedStatement pstmt=conn.prepareStatement("insert into imagetable values(?,?)");
		File file=new File("src/youjiao.jpg");
		InputStream in=new FileInputStream(file);
		pstmt.setString(1, "1");
		pstmt.setBinaryStream(2,in, (int)file.length());
		//执行sql语句
		pstmt.executeUpdate();
		JdbcUtils.release(null, pstmt, conn);
	}
	
	@Test
	public void QueryBlob() throws SQLException, Exception
	{
		Connection conn=JdbcUtils.getConnection();
		PreparedStatement pstmt=conn.prepareStatement("SELECT * FROM imagetable");
		ResultSet rs=pstmt.executeQuery();
		while(rs.next())
		{
			int id=rs.getInt("id");
			InputStream in=rs.getBinaryStream("image");
			File f=new File("src/5.jpg");
			OutputStream os=new FileOutputStream(f);
			byte[] bs=new byte[2014];
			int b=0;
			while((b=in.read(bs))!=-1)
			{
				os.write(bs, 0, b);
			}
			in.close();
			os.close();
		}
		JdbcUtils.release(null, pstmt, conn);
	}
}
