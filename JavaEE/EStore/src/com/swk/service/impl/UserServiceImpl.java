package com.swk.service.impl;

import com.swk.bean.User;
import com.swk.dao.UserDao;
import com.swk.dao.impl.UserDaoImpl;
import com.swk.service.UserService;

public class UserServiceImpl implements UserService {
    
    private UserDao userDao=new UserDaoImpl();
    
    @Override
    public User findUser(User user) {
	User newUser=userDao.findUser(user);
	return newUser;
    }

    @Override
    public boolean addUser(User user) {
	boolean flag=userDao.addUser(user);
	return flag;
    }

    @Override
    public User findUserByNickName(User user) {
	User newUser=userDao.findUserByNickName(user);
	return newUser;
    }

    

}
