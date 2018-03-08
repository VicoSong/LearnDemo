package com.swk.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.swk.bean.User;
import com.swk.dao.UserDao;
import com.swk.utils.JDBCUtils;


public class UserDaoImpl implements UserDao {

    private QueryRunner runner=new QueryRunner(JDBCUtils.getDataSource());
    @Override
    public User findUser(User user) {
	
	try {
	    	
		String sql="select * from user where email=?";
		User newUser=runner.query(sql, new BeanHandler<User>(User.class),user.getEmail());
		return newUser;
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }

    @Override
    public boolean addUser(User user) {
	
	try {
	    String sql="insert into user values(null,?,?,?,?,1,null)";
	    int mm=runner.update(sql,user.getEmail(),user.getPassword(),user.getNickname(),"user");
	    if(mm>0)
	    {
		return true;
	    }
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return false;
    }

    @Override
    public User findUserByNickName(User user) {
	
	
	try {
	    String sql="select * from user where nickname=? and password=?";
	    User newUser=runner.query(sql,new BeanHandler<User>(User.class),user.getNickname(),user.getPassword());
	    return newUser;
	} catch (SQLException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return null;
    }


}
