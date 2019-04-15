package com.edu.service;

import com.edu.model.User;
import com.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    //特有的方法
    public User login(String username,String password);
}
