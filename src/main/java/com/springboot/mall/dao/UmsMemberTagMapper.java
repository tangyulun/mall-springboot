package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberTag;

public interface UmsMemberTagMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberTag record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberTag record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberTag selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberTag record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberTag record);
}