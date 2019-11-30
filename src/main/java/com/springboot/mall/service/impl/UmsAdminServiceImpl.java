package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UmsAdminMapper;
import com.springboot.mall.dto.UmsAdminParam;
import com.springboot.mall.model.UmsAdmin;
import com.springboot.mall.model.UmsPermission;
import com.springboot.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * UmsAdminService的实现类
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
  @Autowired
  private UserDetailsService userDetailsService;
//  @Autowired
//  private JwtTokenUtil jwtTokenUtil;
  @Autowired
  private PasswordEncoder passwordEncoder;
  @Value("${jwt.tokenHead}")
  private String tokenHead;
  @Autowired
  private UmsAdminMapper adminMapper;
//  @Autowired
//  private UmsAdminRoleRelationMapper adminRoleRelationMapper;
//  @Autowired
//  private UmsAdminRoleRelationMapper umsAdminRoleRelationMapper;

  @Override
  public UmsAdmin getAdminByUsername(String username) {
//    UmsAdminExample example = new UmsAdminExample();
//    example.createCriteria().andUsernameEqualTo(username);
//    List<UmsAdmin> adminList = adminMapper.selectByExample(example);
//    if (adminList != null && adminList.size() > 0) {
//      return adminList.get(0);
//    }
    return null;
  }

  @Override
  public UmsAdmin register(UmsAdminParam umsAdminParam){
    UmsAdmin umsAdmin = new UmsAdmin();
    BeanUtils.copyProperties(umsAdminParam,umsAdmin);
    //umsAdmin.setId(new Long(6));
    umsAdmin.setCreateTime(new Date());
    umsAdmin.setStatus(1);
    String md5Password = passwordEncoder.encode(umsAdmin.getPassword());
    umsAdmin.setPassword(md5Password);
    adminMapper.insert(umsAdmin);
    return umsAdmin;
  }
  @Override
  public String login(String username ,String password){
    return null;
  }
  @Override
  public List<UmsPermission> getPermissionList(Long adminId) {
    return null;
  }

}
