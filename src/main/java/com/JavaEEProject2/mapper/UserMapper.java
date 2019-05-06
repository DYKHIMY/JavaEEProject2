package com.JavaEEProject2.mapper;

import com.JavaEEProject2.model.Users;

import java.util.List;

// Created by IntelliJ IDEA.
//User: lhz
//Date: 2019/5/5 
//Time: 20:05
//To change this template use File | Settings | File Templates.
public interface UserMapper {
    List<Users> selectAll();
}
