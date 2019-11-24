package com.springboot.mall.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {
    @RequestMapping("home")
    public String hello() {
        System.out.println(11);
        return "hello spring boot!";
    }
}
