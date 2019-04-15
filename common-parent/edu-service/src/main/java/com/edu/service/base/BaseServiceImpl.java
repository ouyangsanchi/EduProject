package com.edu.service.base;

import com.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseServiceImpl<T> implements IBaseService<T> {

    //同意管理dao
    @Autowired
    protected UserMapper userMapper;
}
