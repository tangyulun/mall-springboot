package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UserMapper;
import com.springboot.mall.model.User;
import com.springboot.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
  @Autowired
  private UserMapper userMapper;
  public Integer toLogin(String username,String password){
    User user = new User();
    user.setUsername(username);
    user.setPassword(password);
    System.out.println(username+"11111111");
    Integer userLogin = userMapper.toLogin(username,password);
    System.out.println(username+"2222222");
    return userLogin;
  }

}
