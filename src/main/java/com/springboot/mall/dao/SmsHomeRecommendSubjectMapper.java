package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeRecommendSubject;

public interface SmsHomeRecommendSubjectMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsHomeRecommendSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsHomeRecommendSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsHomeRecommendSubject selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsHomeRecommendSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsHomeRecommendSubject record);
}