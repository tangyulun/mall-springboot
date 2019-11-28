package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdmin;

public interface UmsAdminMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsAdmin record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsAdmin record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsAdmin selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsAdmin record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsAdmin record);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    int toLogin(String username,String password);
}