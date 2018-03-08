package com.swk.ssh.action;



import com.opensymphony.xwork2.ActionSupport;
import com.swk.ssh.beans.UserBean;
import com.swk.ssh.services.UserManagerService;
import com.swk.ssh.servicesImple.UserManagerImpl;

public class RegisterAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private UserBean user;
	private UserManagerService userManager = new UserManagerImpl();
	
	public UserBean getUser()
	{
		return user;
	}
	
	public void setUser(UserBean user)
	{
		this.user=user;
	}
	
	
	public UserManagerService getUserManager()
	{
		return userManager;
	}

	public void setUserManager(UserManagerService userManager)
	{
		this.userManager = userManager;
	}

	public String execute()
	{
		
		try {
			userManager.regUser(user);
			return SUCCESS;
			
		} catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
		
	}

}
