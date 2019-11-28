package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCouponHistory;

public interface SmsCouponHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsCouponHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsCouponHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsCouponHistory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsCouponHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsCouponHistory record);
}