package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMember;

public interface UmsMemberMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMember record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMember record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMember selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMember record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMember record);
}