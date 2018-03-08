package com.swk.dao;

import com.swk.bean.User;

public interface UserDao {

    public User findUser(User user);

    public boolean addUser(User user);

    public User findUserByNickName(User user);
    
}
