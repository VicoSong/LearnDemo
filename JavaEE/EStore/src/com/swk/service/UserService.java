package com.swk.service;

import com.swk.bean.User;

public interface UserService {

    public User findUser(User user);

    public boolean addUser(User User);

    public User findUserByNickName(User user);

    

}
