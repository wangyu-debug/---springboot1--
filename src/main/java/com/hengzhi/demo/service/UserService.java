package com.hengzhi.demo.service;

import com.hengzhi.demo.bean.User;
import com.hengzhi.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public String getSex(String username){
        return userMapper.getSex(username);
    }

    public void addUser(User user){
        userMapper.addUser(user);
    }

    public void deleteUser(Integer id){
        userMapper.deleteUser(id);
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

}
