package com.springboot.mall.dao;

import com.springboot.mall.model.OmsCartItem;

public interface OmsCartItemMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsCartItem record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsCartItem record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsCartItem selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsCartItem record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsCartItem record);
}