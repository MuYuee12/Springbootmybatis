package com.hwadee.springbootmybatis.service;

import com.hwadee.springbootmybatis.entity.User;
import com.hwadee.springbootmybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public List<User> findAllUser(){
        return userMapper.findAllUser();
    }
    public int addUser(User user){
        return userMapper.addUser(user);
    }
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
    public int deleteUser(User user){
        return userMapper.deleteUser(user);
    }
}
