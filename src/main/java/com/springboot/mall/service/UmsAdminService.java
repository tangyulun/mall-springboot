package com.springboot.mall.service;

import com.springboot.mall.dto.UmsAdminParam;
import com.springboot.mall.dto.UmsAdminUsername;
import com.springboot.mall.model.UmsAdmin;

import java.util.List;

/**
 * UmsAdminService
 */
public interface UmsAdminService {
  /**
   * 查询所有username
   */
  List<UmsAdminUsername> getAdminUsername(String username);

  /**
   * 注册功能
   */
  UmsAdmin register(UmsAdminParam umsAdminParam);

  /**
   * 登录功能
   * @param username 用户名
   * @param password 密码
   * @return 生成的JWT的token
   */
  UmsAdmin login(String username, String password);

}
