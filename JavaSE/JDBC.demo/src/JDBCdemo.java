import java.sql.*;
public class JDBCdemo {
	public static void main(String args[]) throws SQLException
	{
		 String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";   //����JDBC����  
		 
		   String userName = "sa";   //Ĭ���û���  
		 
		    String userPwd = "123456";   //����  
		    String dbURL = "jdbc:sqlserver://localhost:1433; DatabaseName=EMIS";   //���ӷ����������ݿ�sample
		   Connection con; 
		   Statement stmt;
		   ResultSet rs1,rs2;
		 
		   try {  
		 
		   Class.forName(driverName);  
		 
		   con= DriverManager.getConnection(dbURL,userName,userPwd);  
		 
		//   System.out.println("Connection Successful!");   //������ӳɹ� ����̨���Connection Successful!  
		   
			 stmt=con.createStatement();
			 String sql1="SELECT * FROM ESM ";//��ѯ
		//	 String sql2="INSERT INTO ESM(UID,UNAME,UPASSWORD,URIGHT)VALUES('С��','����','101010','��ͨ�û�')";//����
			 String sql3="UPDATE ESM SET URIGHT='��ͨ�û�'WHERE UNAME='����'";//�޸�
			 String sql4="DELETE FROM ESM WHERE UID='С��'";  //ɾ��
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
