package com.hengzhi.demo.controller;

import com.hengzhi.demo.bean.User;
import com.hengzhi.demo.service.UserService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getSex")
    @ResponseBody
    public String getSex(@RequestBody JSONObject jsonObject){
        String username = jsonObject.getString("username");
        return userService.getSex(username);
    }

    @PostMapping("/addUser")
    @ResponseBody
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @DeleteMapping("deleteUser")
    @ResponseBody
    public void delete(@RequestBody JSONObject jsonObject){
        userService.deleteUser(jsonObject.getInt("id"));
    }

    @PatchMapping("/updateUser")
    @ResponseBody
    public void updateUser(@RequestBody User user){
        userService.updateUser(user);
    }
}
