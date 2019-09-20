package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.inter.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户表
 * Created  by Mr.kk
 * DateTime on 2019-09-20 11:19:11
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 测试多数据源查询
     */
    @GetMapping("/getAll")
    public Object getAll(User user){
        return userService.getAll(user);
    }


}
