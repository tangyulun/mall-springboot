package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberLevel;

public interface UmsMemberLevelMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberLevel record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberLevel record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberLevel selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberLevel record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberLevel record);
}