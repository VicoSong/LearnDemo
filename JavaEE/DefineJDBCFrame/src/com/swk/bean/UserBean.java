package com.swk.bean;

import java.io.Serializable;

public class UserBean implements Serializable {
	private int id;
	
	private String user;
	
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getuser() {
		return user;
	}

	public void setuser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "userBean [id=" + id + ", user=" + user + ", password=" + password + "]";
	}
	
	
}
