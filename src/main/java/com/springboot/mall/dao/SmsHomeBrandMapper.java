package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeBrand;

public interface SmsHomeBrandMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsHomeBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsHomeBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsHomeBrand selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsHomeBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsHomeBrand record);
}