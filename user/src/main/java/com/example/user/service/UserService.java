package com.example.user.service;

import com.example.user.entity.User;
import com.example.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectedById(User user){
        return userMapper.selectByPrimaryKey(user);
    }
}
