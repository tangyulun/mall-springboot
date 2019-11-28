package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductCategory;

public interface PmsProductCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductCategory record);
}