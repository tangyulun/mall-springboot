package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeAdvertise;

public interface SmsHomeAdvertiseMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsHomeAdvertise record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsHomeAdvertise record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsHomeAdvertise selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsHomeAdvertise record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsHomeAdvertise record);
}