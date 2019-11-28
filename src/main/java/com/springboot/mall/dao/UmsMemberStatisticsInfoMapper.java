package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberStatisticsInfo;

public interface UmsMemberStatisticsInfoMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberStatisticsInfo record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberStatisticsInfo record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberStatisticsInfo selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberStatisticsInfo record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberStatisticsInfo record);
}