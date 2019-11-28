package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCoupon;

public interface SmsCouponMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsCoupon record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsCoupon record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsCoupon selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsCoupon record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsCoupon record);
}