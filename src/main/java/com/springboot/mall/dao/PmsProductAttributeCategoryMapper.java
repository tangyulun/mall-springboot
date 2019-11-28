package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductAttributeCategory;

public interface PmsProductAttributeCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductAttributeCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductAttributeCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductAttributeCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductAttributeCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductAttributeCategory record);
}