package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotion;

public interface SmsFlashPromotionMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsFlashPromotion record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsFlashPromotion record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsFlashPromotion selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsFlashPromotion record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsFlashPromotion record);
}