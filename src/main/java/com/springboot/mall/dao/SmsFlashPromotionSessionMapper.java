package com.springboot.mall.dao;

import com.springboot.mall.model.SmsFlashPromotionSession;

public interface SmsFlashPromotionSessionMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsFlashPromotionSession record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsFlashPromotionSession record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsFlashPromotionSession selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsFlashPromotionSession record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsFlashPromotionSession record);
}