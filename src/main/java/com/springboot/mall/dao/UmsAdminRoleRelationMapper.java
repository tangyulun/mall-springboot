package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdminRoleRelation;

public interface UmsAdminRoleRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsAdminRoleRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsAdminRoleRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsAdminRoleRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsAdminRoleRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsAdminRoleRelation record);
}