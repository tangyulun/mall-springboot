package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductAttribute;

public interface PmsProductAttributeMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductAttribute record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductAttribute record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductAttribute selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductAttribute record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductAttribute record);
}