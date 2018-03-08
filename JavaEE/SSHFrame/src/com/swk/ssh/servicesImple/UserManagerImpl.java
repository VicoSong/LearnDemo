package com.swk.ssh.servicesImple;


import com.swk.ssh.beans.UserBean;
import com.swk.ssh.dao.BaseDao;
import com.swk.ssh.daoImpl.UserDao;
import com.swk.ssh.services.UserManagerService;

/**
 * Description:Hibernate业务逻辑实现类
 * @author weikang.song
 *
 */
public class UserManagerImpl implements UserManagerService{

	private BaseDao dao = new UserDao();
	/*private Session session;*/
	/*public UserManagerImpl()
	{
		dao=new UserDao();
	}*/
	
	public BaseDao getDao()
	{
		return dao;
	}

	public void setDao(BaseDao dao)
	{
		this.dao=dao;
	}
	
	public void regUser(UserBean userForm)
	{
		/*session=HibernateSessionFactory.getSession();
		dao.setSession(session);*/
		//获取事务
		/*Transaction ts=session.beginTransaction();*/
		//构造UserBean都对象
		/*UserBean userBean=new UserBean();
		userBean.setUsername(userForm.getUsername());
		userBean.setPassword(userForm.getPassword());
		userBean.setGender(userForm.getGender());
		//保存UserBean对象
		session.save(userBean);*/
		//提交事务
		/*ts.commit();*/
		//关闭session
		/*HibernateSessionFactory.closeSession();*/
		
		//UserBean user=new UserBean();
		//BeanUtils.copyProperties(userForm, user);
		dao.saveObject(userForm);
		
		
	}
	
}
