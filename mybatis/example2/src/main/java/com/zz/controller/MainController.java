package com.zz.controller;

import com.zz.mapper.UserMapper;
import com.zz.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @className: MainController
 * @author: zhangzhou
 * @date: 2026/10/10 下午4:08
 * @description:
 */
@RestController
@RequestMapping("/")
public class MainController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/")
    public Object index() {
        User userParam = new User();
        userParam.setSchoolName("Sunny School");
        List<User> userList = userMapper.queryUserBySchoolName(userParam);
        for (User user : userList) {
            System.out.println("name : " + user.getName() + " ;  email : " + user.getEmail());
        }
        return userList;
    }
}
