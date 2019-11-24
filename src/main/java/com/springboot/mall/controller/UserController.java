package com.springboot.mall.controller;

import com.springboot.mall.dao.UserMapper;
import com.springboot.mall.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Random;

@RequestMapping("/user")
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/name")
    public String getUserName(String name, String pwd, String phone) {
        Random random = new Random();
        return name + "-" + random.nextInt(100) + "-@" + pwd + ":" + phone;
    }

    @GetMapping("/id")
    public User getUser(@RequestParam("id") Integer id) {
        User user = userMapper.selectByPrimaryKey(id);
        //user.setUserName("唐唐");
        System.out.println(user);
        return user;
    }

    @PostMapping("/save")
    public int saveUser(@RequestBody User user) {
        System.out.println(user);
       return userMapper.insertSelective(user);
    }
//    @PostMapping("/del")
//    public int delUser(@RequestParam("id") Integer id) {
//        return userMapper.deleteByPrimaryKey(id);
//    }


}
