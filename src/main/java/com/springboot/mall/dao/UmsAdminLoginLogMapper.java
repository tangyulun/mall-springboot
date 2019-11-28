package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdminLoginLog;

public interface UmsAdminLoginLogMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsAdminLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsAdminLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsAdminLoginLog selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsAdminLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsAdminLoginLog record);
}