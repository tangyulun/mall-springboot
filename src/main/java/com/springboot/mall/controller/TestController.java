package com.springboot.mall.controller;

import com.springboot.mall.dao.UmsMemberLevelMapper;
import com.springboot.mall.dao.UserMapper;
import com.springboot.mall.model.UmsMemberLevel;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * TestController
 */
@Api(tags = "TestController", description = "测试")
@RequestMapping("/test")
@RestController
public class TestController {
    @Autowired
    private UmsMemberLevelMapper umsMemberLevelMapper;
    @Autowired
    private UserMapper userMapper;
    @ApiOperation("启动成功")
    @RequestMapping("home")
    public String hello() {
        System.out.println(11);
        return "hello spring boot!";
    }
    @ApiOperation("根据ID查询")
    @GetMapping("/testById")
    public UmsMemberLevel getUmsMemberLevel(@RequestParam("id") Long id) {
        UmsMemberLevel umsMemberLevel = umsMemberLevelMapper.selectByPrimaryKey(id);
        System.out.println(umsMemberLevel);
        return umsMemberLevel;
    }
    @ApiOperation("登录接口")
    @RequestMapping("testLogin")
    public String toLogin(String username,String password){
        Integer userLogin = userMapper.toLogin(username,password);
        System.out.println(userLogin);
        if (username !=null && password !=null && userLogin ==1){
            return "success";
        }else {
            return "error";
        }
    }

}
