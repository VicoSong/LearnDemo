import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
public class Dao {
	protected static String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=EMIS";   //���ӷ����������ݿ�sample  
	
	protected static String userName = "sa";   //Ĭ���û���  
	 
	protected static String userPwd = "101000";   //����  
	private static Connection conn=null;
	private Dao() {
		try {
			if (conn == null) {
				Class.forName(dbURL).newInstance();
				conn = DriverManager.getConnection(dbURL, userName, userName);
			}
			else
				return;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	  static ResultSet executeQuery(String sql)
	 {
		 try
		 {
			if(conn==null)  new Dao();
			return conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE).executeQuery(sql);
		 }catch(SQLException e)
		 {
			 e.printStackTrace();
			 return null;
		 }finally{}
	 }
	 private static int UPDATE(String sql)
	 {
		 try
		 {
			if(conn==null) new Dao();
			return conn.createStatement().executeUpdate(sql);
		 }catch(SQLException e)
		 {
			 e.printStackTrace();
			 return -1;
		 }
	 }
	 public static void close()
	 {
		 try
		 {
			conn.close(); 
		 }catch(SQLException e)
		 {
			 e.printStackTrace();
		 }finally
		 {
			 conn=null;
		 }
	 }
}
