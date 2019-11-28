package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductOperateLog;

public interface PmsProductOperateLogMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductOperateLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductOperateLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductOperateLog selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductOperateLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductOperateLog record);
}