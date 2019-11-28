package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotionLog;

public interface SmsFlashPromotionLogMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsFlashPromotionLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsFlashPromotionLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsFlashPromotionLog selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionLog record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsFlashPromotionLog record);
}