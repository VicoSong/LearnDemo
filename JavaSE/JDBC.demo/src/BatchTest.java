

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.junit.Test;



public class BatchTest {
	//执行不带返回值的存储过程没有任何意义
	@Test
	public void procedureTest() throws SQLException
	{
		//获得连接对象
		Connection conn=JdbcUtils.getConnection();
		//创建执行存储过程的命令对象
		CallableStatement cstmt=conn.prepareCall("{call pro2(?)}");
		//指定？的值
		cstmt.setInt(1, 300);
		//执行存储过程
		cstmt.executeUpdate();
		
		//释放资源
		JdbcUtils.release(null, cstmt, conn);
	}
	
	//执行带返回值的存储过程
		@Test
		public void procedureDemo() throws SQLException
		{
			//获得连接对象
			Connection conn=JdbcUtils.getConnection();
			//创建执行存储过程的命令对象
			CallableStatement cstmt=conn.prepareCall("{call pro4(?,?)}");
			//指定？的值
			cstmt.setInt(1, 300);
			//指定第二个?为输出参数
			cstmt.registerOutParameter(2,Types.VARCHAR);
			//执行存储过程
			cstmt.executeUpdate();
			//获得返回值
			String name=cstmt.getString(2);
			System.out.println(name);
			//释放资源
			JdbcUtils.release(null, cstmt, conn);
		}
	
	
}
