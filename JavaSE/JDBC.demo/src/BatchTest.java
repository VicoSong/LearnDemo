

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;

import org.junit.Test;



public class BatchTest {
	//ִ�в�������ֵ�Ĵ洢����û���κ�����
	@Test
	public void procedureTest() throws SQLException
	{
		//������Ӷ���
		Connection conn=JdbcUtils.getConnection();
		//����ִ�д洢���̵��������
		CallableStatement cstmt=conn.prepareCall("{call pro2(?)}");
		//ָ������ֵ
		cstmt.setInt(1, 300);
		//ִ�д洢����
		cstmt.executeUpdate();
		
		//�ͷ���Դ
		JdbcUtils.release(null, cstmt, conn);
	}
	
	//ִ�д�����ֵ�Ĵ洢����
		@Test
		public void procedureDemo() throws SQLException
		{
			//������Ӷ���
			Connection conn=JdbcUtils.getConnection();
			//����ִ�д洢���̵��������
			CallableStatement cstmt=conn.prepareCall("{call pro4(?,?)}");
			//ָ������ֵ
			cstmt.setInt(1, 300);
			//ָ���ڶ���?Ϊ�������
			cstmt.registerOutParameter(2,Types.VARCHAR);
			//ִ�д洢����
			cstmt.executeUpdate();
			//��÷���ֵ
			String name=cstmt.getString(2);
			System.out.println(name);
			//�ͷ���Դ
			JdbcUtils.release(null, cstmt, conn);
		}
	
	
}
