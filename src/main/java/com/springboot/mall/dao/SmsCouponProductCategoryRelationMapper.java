package com.springboot.mall.dao;

import com.springboot.mall.model.SmsCouponProductCategoryRelation;

public interface SmsCouponProductCategoryRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsCouponProductCategoryRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsCouponProductCategoryRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsCouponProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsCouponProductCategoryRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsCouponProductCategoryRelation record);
}