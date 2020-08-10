package com.hwadee.springbootmybatis.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hwadee.springbootmybatis.entity.Result;
import com.hwadee.springbootmybatis.entity.User;
import com.hwadee.springbootmybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @GetMapping
    public String login(){
        return "login";
    }

    @RequestMapping("login")
    @ResponseBody
    public Result login(@RequestBody String param){
        Result result = new Result();
        result.setCode(200);
        result.setMessage("验证成功");
        result.setData(param);
        return result;
    }

    @RequestMapping("/register")
    @ResponseBody
    public Result register(@RequestBody String param){
        Result result = new Result();
        result.setCode(201);
        result.setMessage("注册成功");
        result.setData(param);
        JSONObject json = JSON.parseObject(param);
        System.out.println(json.getString("userName"));
        User user = new User(json.getString("userName"),json.getString("password"));
        System.out.println(userService.addUser(user)+"register");
        return result;
    }
    @RequestMapping("/update")
    @ResponseBody
    public Result update(@RequestBody String param){
        Result result = new Result();
        result.setCode(202);
        result.setMessage("更新成功");
        result.setData(param);
        JSONObject json = JSON.parseObject(param);
        User user = new User(json.getInteger("uid"),json.getString("userName"),json.getString("password"));
        System.out.println(userService.updateUser(user)+"update");
        return result;
    }
    @RequestMapping("/delete")
    @ResponseBody
    public Result delete(@RequestBody String param){
        Result result = new Result();
        result.setCode(203);
        result.setMessage("删除成功");
        result.setData(param);
        JSONObject json = JSON.parseObject(param);
        User user = new User(json.getInteger("uid"));
        System.out.println(userService.deleteUser(user)+"delete");
        return result;
    }

    @RequestMapping("/toUser")
    public String toUser(){
        return "user";
    }
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }


}
