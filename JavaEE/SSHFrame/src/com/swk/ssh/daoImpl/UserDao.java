package com.swk.ssh.daoImpl;


import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.swk.ssh.dao.BaseDao;


public class UserDao extends HibernateDaoSupport implements BaseDao{
	//private Session session;
	

	@Override
	public void saveObject(Object obj)  
	{
		/* session.save(obj);*/
		try {
			getHibernateTemplate().save(obj);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*@Override
	public Session getSession()
	{
		
		return session;
	}

	@Override
	public void setSession(Session session)
	{
		this.session=session;
		
	}*/

}
