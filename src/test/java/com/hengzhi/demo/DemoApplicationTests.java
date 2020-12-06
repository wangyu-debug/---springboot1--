package com.hengzhi.demo;

import com.hengzhi.demo.bean.User;
import com.hengzhi.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@SpringBootTest
class DemoApplicationTests {
    @Autowired
    UserService us;

    @Test
    void contextLoads() {
        String sex = us.getSex("yyx");
        System.out.println("sex:"+sex);
    }

    @Test
    void addTest(){
        User user = new User();
        user.setSex("woman");
        user.setUsername("wy");
        us.addUser(user);
        User user1 = new User();
        user1.setUsername("rdf");
        us.addUser(user1);
    }

    @Test
    void deleteTest(){
        Integer id = 1;
        us.deleteUser(id);
    }

    @Test
    void updateUser(){
        User user = new User();
        user.setUsername("YYX");
        user.setId(1);
        us.updateUser(user);
    }

}
