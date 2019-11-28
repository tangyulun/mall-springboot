package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberTask;

public interface UmsMemberTaskMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberTask record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberTask record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberTask selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberTask record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberTask record);
}