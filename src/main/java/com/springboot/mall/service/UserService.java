package com.springboot.mall.service;

/**
 * UserService
 */
public interface UserService {
  /**
   * 登录
   * @param username
   * @param password
   * @return
   */
  Integer toLogin(String username,String password);
}
