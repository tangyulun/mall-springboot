package com.springboot.mall.dao;

import com.springboot.mall.model.UmsRole;

public interface UmsRoleMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsRole record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsRole record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsRole selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsRole record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsRole record);
}