package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberMemberTagRelation;

public interface UmsMemberMemberTagRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberMemberTagRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberMemberTagRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberMemberTagRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberMemberTagRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberMemberTagRelation record);
}