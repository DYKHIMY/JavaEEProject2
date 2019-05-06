package com.JavaEEProject2.service;

import com.JavaEEProject2.mapper.UserMapper;
import com.JavaEEProject2.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

// Created by IntelliJ IDEA.
//User: lhz
//Date: 2019/5/5 
//Time: 20:06
//To change this template use File | Settings | File Templates.
@Service
@Component
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<Users> selectAll(){
        List<Users> list=userMapper.selectAll();
        return list;
    }


}
