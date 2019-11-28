package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductVertifyRecord;

public interface PmsProductVertifyRecordMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductVertifyRecord record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductVertifyRecord record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductVertifyRecord selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductVertifyRecord record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductVertifyRecord record);
}