package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderItem;

public interface OmsOrderItemMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsOrderItem record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsOrderItem record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsOrderItem selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsOrderItem record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsOrderItem record);
}