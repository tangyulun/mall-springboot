package com.springboot.mall.service;

/**
 * UmsAdminService
 */
public interface UmsAdminService {
  /**
   * 登录
   * @param username
   * @param password
   * @return
   */
  Integer login(String username,String password);
}
