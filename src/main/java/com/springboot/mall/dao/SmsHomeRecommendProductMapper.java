package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeRecommendProduct;

public interface SmsHomeRecommendProductMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsHomeRecommendProduct record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsHomeRecommendProduct record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsHomeRecommendProduct selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendProduct record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsHomeRecommendProduct record);
}