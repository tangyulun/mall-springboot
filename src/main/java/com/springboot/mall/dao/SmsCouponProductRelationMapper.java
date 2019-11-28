package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCouponProductRelation;

public interface SmsCouponProductRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsCouponProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsCouponProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsCouponProductRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsCouponProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsCouponProductRelation record);
}