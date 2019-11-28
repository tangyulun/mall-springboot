package com.springboot.mall.dao;

import com.springboot.mall.model.UmsPermission;

public interface UmsPermissionMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsPermission record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsPermission record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsPermission selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsPermission record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsPermission record);
}