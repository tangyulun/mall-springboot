package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberLoginLog;

public interface UmsMemberLoginLogMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberLoginLog selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberLoginLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberLoginLog record);
}