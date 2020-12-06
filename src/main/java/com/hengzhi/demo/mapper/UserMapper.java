package com.hengzhi.demo.mapper;


import com.hengzhi.demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Mapper
@Repository
public interface UserMapper {
    //查找
    String getSex(String username);

    //增加
    void addUser(User user);

    //删除
    void deleteUser(Integer id);

    //修改
    void updateUser(User user);
}
