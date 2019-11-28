package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UmsAdminMapper;
import com.springboot.mall.model.UmsAdmin;
import com.springboot.mall.service.UmsAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UmsAdminService的实现类
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

  @Autowired
  private UmsAdminMapper umsAdminMapper;

  public Integer login(String username,String password){
    UmsAdmin umsAdmin = new UmsAdmin();
    umsAdmin.setUsername(username);
    umsAdmin.setPassword(password);
    Integer umsLogin = umsAdminMapper.toLogin(username,password);
    return umsLogin;
  }

}
