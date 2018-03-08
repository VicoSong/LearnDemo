import java.sql.*;
public class JDBCdemo {
	public static void main(String args[]) throws SQLException
	{
		 String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //加载JDBC驱动  
		 
		   String userName = "sa";   //默认用户名  
		 
		    String userPwd = "123456";   //密码  
		    String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=EMIS";   //连接服务器和数据库sample
		   Connection con; 
		   Statement stmt;
		   ResultSet rs1,rs2;
		 
		   try {  
		 
		   Class.forName(driverName);  
		 
		   con= DriverManager.getConnection(dbURL,userName,userPwd);  
		 
		//   System.out.println("Connection Successful!");   //如果连接成功 控制台输出Connection Successful!  
		   
			 stmt=con.createStatement();
			 String sql1="SELECT * FROM ESM ";//查询
		//	 String sql2="INSERT INTO ESM(UID,UNAME,UPASSWORD,URIGHT)VALUES('小游','游游','101010','普通用户')";//增加
			 String sql3="UPDATE ESM SET URIGHT='普通用户'WHERE UNAME='麻子'";//修改
			 String sql4="DELETE FROM ESM WHERE UID='小陈'";  //删除
			 try{
			 rs1=stmt.executeQuery(sql3); 
			 }
			 catch(Exception e)
			 {
				 System.err.println();
			 }
			 finally{
			 rs2=stmt.executeQuery(sql1);
			 System.out.println("Table contained:");
			 while(rs2.next()){
				 String number=rs2.getString("UID");
				 String name=rs2.getString("UNAME");
				 String password=rs2.getString("UPASSWORD");
				 String right=rs2.getString("URIGHT");
				 System.out.println(number+" "+name+" "+password+" "+right);
			 }
			 }
		   } catch (Exception e) {  
		 
		   e.printStackTrace();  
		 
		   }  
		 
	}
}
