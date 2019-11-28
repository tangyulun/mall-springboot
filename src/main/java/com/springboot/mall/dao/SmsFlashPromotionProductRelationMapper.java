package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotionProductRelation;

public interface SmsFlashPromotionProductRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsFlashPromotionProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsFlashPromotionProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsFlashPromotionProductRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsFlashPromotionProductRelation record);
}