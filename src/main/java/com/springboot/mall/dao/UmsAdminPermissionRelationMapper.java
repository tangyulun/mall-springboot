package com.springboot.mall.dao;

import com.springboot.mall.model.UmsAdminPermissionRelation;

public interface UmsAdminPermissionRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsAdminPermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsAdminPermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsAdminPermissionRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsAdminPermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsAdminPermissionRelation record);
}