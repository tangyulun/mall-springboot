package com.springboot.mall.dao;

import com.springboot.mall.model.PmsSkuStock;

public interface PmsSkuStockMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsSkuStock record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsSkuStock record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsSkuStock selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsSkuStock record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsSkuStock record);
}