package com.springboot.mall.dao;

import com.springboot.mall.model.UmsRolePermissionRelation;

public interface UmsRolePermissionRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsRolePermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsRolePermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsRolePermissionRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsRolePermissionRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsRolePermissionRelation record);
}