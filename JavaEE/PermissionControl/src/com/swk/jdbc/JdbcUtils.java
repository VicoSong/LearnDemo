package com.swk.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;




public class JdbcUtils {
    private static final String DRIVER_CLASS;
    private static final String URL;
    private static final String USER;
    private static final String PASSWORD;
    static{
        ResourceBundle rb=ResourceBundle.getBundle("dbcfg");
        DRIVER_CLASS=rb.getString("driverClass");
        URL=rb.getString("url");
        USER=rb.getString("user");
        PASSWORD=rb.getString("password");    

        try {
            Class.forName(DRIVER_CLASS);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection()
    {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) 
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return null;
    }

    public static void release(ResultSet rs,Statement stmt,Connection conn)
    {
        if(rs!=null)
        {
            try {
                rs.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if(stmt!=null)
        {
            try {
                stmt.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        if(conn!=null)
        {
            try {
                conn.close();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
 
}
