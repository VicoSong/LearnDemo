package com.swk.test;



import java.util.List;

import org.junit.Test;

import com.swk.DBAssist.DBAssist;
import com.swk.bean.UserBean;
//�����Զ�����
public class TestDefineFrame {

	//�������
	@Test
	public void testAdd() 
	{
		  DBAssist dba=new DBAssist();
		  String sqlStr="insert into user(user,password)values(?,?)";
		  dba.update(sqlStr,"����","123456");
		  
	}
	
	//�����޸�
	@Test
	public void testModify() 
	{
		  DBAssist dba=new DBAssist();
		  String sqlStr="update user set user=? where id=?";
		  dba.update(sqlStr,"Vico","3");
		  
	}
	
	//����ɾ��
		@Test
		public void testDelete() 
		{
			  DBAssist dba=new DBAssist();
			  String sqlStr="delete from user where id=?";
			  dba.update(sqlStr,3);
			  
		}
		
		//���Բ�ѯ
				@Test
				public void testQuery() 
				{
					  DBAssist dba=new DBAssist();
					  String sqlStr="select * from user";
					  List<UserBean> list= (List<UserBean>) dba.query(sqlStr,UserBean.class);
					  
					  for(int i=0;i<list.size();i++)
					  {
						  System.out.println(list.get(i).toString());
					  }
					  
				}



}
