package com.wj.service;

import com.wj.dao.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    public void setUserService(UserDao userDao){
        this.userDao = userDao;
    }
    public void say(){
        this.userDao.say();
        System.out.println("userDao say hello World!");
    }
}
