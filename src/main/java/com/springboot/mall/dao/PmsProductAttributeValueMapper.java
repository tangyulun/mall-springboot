package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductAttributeValue;

public interface PmsProductAttributeValueMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductAttributeValue record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductAttributeValue record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductAttributeValue selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductAttributeValue record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductAttributeValue record);
}