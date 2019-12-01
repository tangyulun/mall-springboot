package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UmsAdminMapper;
import com.springboot.mall.dto.UmsAdminParam;
import com.springboot.mall.model.UmsAdmin;
import com.springboot.mall.service.UmsAdminService;
import com.springboot.mall.utils.JwtTokenUtil;
import com.springboot.mall.utils.MD5Util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * UmsAdminService的实现类
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
  @Autowired
  private JwtTokenUtil jwtTokenUtil;
  @Autowired
  private PasswordEncoder passwordEncoder;
  @Value("${jwt.tokenHead}")
  private String tokenHead;
  @Autowired
  private UmsAdminMapper adminMapper;

  @Override
  public UmsAdmin register(UmsAdminParam umsAdminParam){
    UmsAdmin umsAdmin = new UmsAdmin();
    BeanUtils.copyProperties(umsAdminParam,umsAdmin);
//    List<UmsAdmin> umsAdminList = adminMapper.selectByUsername(umsAdmin.getUsername());
//    if (umsAdmin.getUsername()!=null && umsAdminList.size()>0){
//      return null;
//    }
    umsAdmin.setCreateTime(new Date());
    umsAdmin.setStatus(1);
    //密码用MD5加密
    //String md5Password = passwordEncoder.encode(umsAdmin.getPassword());
    String md5Password = MD5Util.string2MD5(umsAdmin.getPassword());
    umsAdmin.setPassword(md5Password);
    adminMapper.insert(umsAdmin);
    return umsAdmin;
  }


  @Override
  public UmsAdmin login(String username , String password ){
    UmsAdmin umsAdmin = new UmsAdmin();
    umsAdmin.setPassword(password);
    umsAdmin.setUsername(username);
    umsAdmin = adminMapper.login(username,password);
    return umsAdmin;
  }


}
