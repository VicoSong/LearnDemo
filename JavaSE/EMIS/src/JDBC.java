import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {

	private static final String DRIVERCLASS = "com.microsoft.jdbc.sqlserver.SQLServerDriver";

	private static final String URL = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=EMIS";

	private static final String USERNAME = "sa";

	private static final String PASSWORD = "101000";

	private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<Connection>();

	static {// ͨ����̬�����������ݿ�����
		try {
			Class.forName(DRIVERCLASS).newInstance();// �������ݿ�����
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connection getConnection() {// �������ݿ����ӵķ���
		Connection conn = threadLocal.get();// ���߳��л�����ݿ�����
		if (conn == null) {// û�п��õ����ݿ�����
			try {
				conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);// �����µ����ݿ�����
				threadLocal.set(conn);// �����ݿ����ӱ��浽�߳���
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static boolean closeConnection() {// �ر����ݿ����ӵķ���
		boolean isClosed = true;
		Connection conn = threadLocal.get();// ���߳��л�����ݿ�����
		threadLocal.set(null);// ����߳��е����ݿ�����
		if (conn != null) {// ���ݿ����ӿ���
			try {
				conn.close();// �ر����ݿ�����
			} catch (SQLException e) {
				isClosed = false;
				e.printStackTrace();
			}
		}
		return isClosed;
	}

}