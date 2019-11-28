package com.springboot.mall.dao;

import com.springboot.mall.model.SmsHomeNewProduct;

public interface SmsHomeNewProductMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(SmsHomeNewProduct record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(SmsHomeNewProduct record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    SmsHomeNewProduct selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(SmsHomeNewProduct record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(SmsHomeNewProduct record);
}