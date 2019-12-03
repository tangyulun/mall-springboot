package com.springboot.mall.service.impl;

import com.springboot.mall.dao.UmsAdminLoginLogMapper;
import com.springboot.mall.dao.UmsAdminMapper;
import com.springboot.mall.dto.UmsAdminParam;
import com.springboot.mall.dto.UmsAdminUsername;
import com.springboot.mall.model.UmsAdmin;
import com.springboot.mall.model.UmsAdminLoginLog;
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
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

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
  @Autowired
  private UmsAdminLoginLogMapper loginLogMapper;

  @Override
  public List<UmsAdminUsername> getAdminUsername(String username){
    return adminMapper.getAdminUsername(username);
  }


  @Override
  public UmsAdmin register(UmsAdminParam umsAdminParam){
    UmsAdmin umsAdmin = new UmsAdmin();
    BeanUtils.copyProperties(umsAdminParam,umsAdmin);
    //判断用户名是否存在
    List<UmsAdminUsername> umsAdminList = adminMapper.getAdminUsername(umsAdmin.getUsername());
    if (umsAdmin.getUsername()==null || umsAdminList.size() > 0){
      return null;
    }
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
    insertLoginLog(username, password);
    updateLoginTimeByUsername(username, password);
    return umsAdmin;
  }

  /**
   * 添加登录记录
   * @param username
   * @param password
   */
  private void insertLoginLog(String username,String password){
    UmsAdmin umsAdmin = new UmsAdmin();
    umsAdmin = adminMapper.login(username,password);
    UmsAdminLoginLog umsAdminLoginLog = new UmsAdminLoginLog();
    umsAdminLoginLog.setAdminId(umsAdmin.getId());
    umsAdminLoginLog.setCreateTime(new Date());
    ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
    HttpServletRequest request = attributes.getRequest();
    umsAdminLoginLog.setIp(request.getRemoteAddr());
    loginLogMapper.insert(umsAdminLoginLog);
  }

  /**
   * 修改最后登录登录时间
   * @param username
   * @param password
   */
  private void updateLoginTimeByUsername(String username,String password){
    UmsAdmin umsAdmin = new UmsAdmin();
    umsAdmin = adminMapper.login(username, password);
    umsAdmin.setLoginTime(new Date());
    adminMapper.updateByPrimaryKey(umsAdmin);
  }

}
