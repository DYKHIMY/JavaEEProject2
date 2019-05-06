package com.JavaEEProject2.controller;

import com.JavaEEProject2.model.Users;
import com.JavaEEProject2.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// Created by IntelliJ IDEA.
//User: lhz
//Date: 2019/5/5 
//Time: 20:04
//To change this template use File | Settings | File Templates.
@Controller
@RequestMapping("User")
public class UserController {

    @Autowired
    private UserService userService;

    public UserController() {}
    @RequestMapping(value = "Login", method = RequestMethod.POST)
    @ResponseBody
    public JSONObject login(String name, String password)  {
        //String passwordByMd5 = MD5.MD5(password);
        JSONObject jsonObject=new JSONObject();
        String word;
        if (name == "") {
            word = "请填写用户名";
            jsonObject.put("woord",word);
            return jsonObject;
        }
        if (password == "") {
            word = "请输入密码";
            jsonObject.put("woord",word);
            return jsonObject;
        }
        //判断登录名和密码
        List<Users> list = userService.selectAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getUserName().equals(name)) {
                if (list.get(i).getUserPassword().equals(password)) {
                    word = "12306";
                    String userid=String.valueOf(list.get(i).getUserId());
                    jsonObject.put("userid",userid);
                    jsonObject.put("woord",word);
                    System.out.println(jsonObject.toString());
                    return jsonObject;
                } else {
                    word = "密码输入有误，请重新输入";
                    jsonObject.put("woord",word);
                    return jsonObject;
                }
            }
        }
        word = "用户不存在";
        jsonObject.put("woord",word);
        return jsonObject;
    }
}
