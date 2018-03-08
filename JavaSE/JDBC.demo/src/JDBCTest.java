import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBCTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException
	{
		String driverClass="";
		String url="";
		String user="";
		String password="";
		
		Properties properties=new Properties();
		InputStream inputStream=JDBCTest.class.getClassLoader().getResourceAsStream("dbcfg.properties");
		properties.load(inputStream);
		
		driverClass=properties.getProperty("driverClass");
		url=properties.getProperty("url");
		user=properties.getProperty("user");
		password=properties.getProperty("password");
		//System.err.println("驱动是："+driverClass+",\nurl是："+url+"\n用户名是："+user+"\n密码是："+password);
		
		
		//1.注册驱动，共有三种方式
		//1.1 注册驱动的第一种方式
		/*
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);
		*/
		//1.2注册驱动的第二种方式
		/*
			 Driver driver=(Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
			 DriverManager.registerDriver(driver);
		*/
		//1.3 注册驱动的第三种方式
		Class.forName(driverClass); //自动进行注册
		
		//2.创建一个连接对象，共有三种方式
		//2.1 使用DriverManager.getConnection(String url)创建连接对象
		/*
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db?user=root&password=123456");
		*/
		//2.2 使用DriverManager.getConnection(url, info)创建连对象
			/*Properties properties=new Properties();
			InputStream inputStream=JDBCTest.class.getClassLoader().getResourceAsStream("dbcfg.properties");
			properties.load(inputStream);
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_db", properties);*/
		//2.3 使用DriverManager.getConnection(url,user,password)
			Connection conn=DriverManager.getConnection(url,user,password);
		//3.创建一个SQL语句的发送命令对象
		Statement stmt=conn.createStatement();
		//4.1 执行SQL语句，拿到查询到的结果集对象
		ResultSet rs=stmt.executeQuery("select * from student");
		//4.2 执行插入命令
		/*String insertSql="insert into dept(dept_id,coll_id,dept_name)values('0301','01','计算机科学导论')";
		int n=stmt.executeUpdate(insertSql);
		System.out.println(n);*/
		//4.3 执行更新命令
		/*String updateSql="update dept set dept_name='Computer Science Instriction' where dept_id='0301' ";
		int n=stmt.executeUpdate(updateSql);
		System.out.println(n);*/
		//4.4 执行删除命令
		/*String deleteSql="delete from dept where dept_id='0301' ";
		int n=stmt.executeUpdate(deleteSql);
		System.out.print(n);*/
		//5.输出结果集的数据
		while(rs.next())
		{
			//拿到结果集的方式
			//1.根据字段名拿取（推荐）
			/*String stuName=rs.getString("stu_name"); //代表的是结果集字段名
			String stuId=rs.getString("stu_id");
			System.out.println("学号为："+stuId+"的学生姓名是："+stuName);*/
			//2.根据字段的索引（从1开始）
			String stuName=rs.getString(2); //代表的是结果集字段名
			String stuId=rs.getString(1);
			System.out.println("学号为："+stuId+"的学生姓名是："+stuName);
		}
		//6.关闭连接、命令对象、结果集
		//rs.close();
		stmt.close();
		conn.close();
	}
}
