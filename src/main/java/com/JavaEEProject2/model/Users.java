package com.JavaEEProject2.model;

// Created by IntelliJ IDEA.
//User: lhz
//Date: 2019/5/5 
//Time: 20:05
//To change this template use File | Settings | File Templates.
public class Users {
    private int userId;
    private String userName;
    private String userPassword;


    public Users() {
        super();
    }
    public Users(int userId,String userName,String userPassword){
        this.userId=userId;
        this.userName=userName;
        this.userPassword=userPassword;
    }
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

}
