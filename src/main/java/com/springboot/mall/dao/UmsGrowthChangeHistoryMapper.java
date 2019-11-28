package com.springboot.mall.dao;

import com.springboot.mall.model.UmsGrowthChangeHistory;

public interface UmsGrowthChangeHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsGrowthChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsGrowthChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsGrowthChangeHistory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsGrowthChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsGrowthChangeHistory record);
}