package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductCategoryAttributeRelation;

public interface PmsProductCategoryAttributeRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductCategoryAttributeRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductCategoryAttributeRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductCategoryAttributeRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductCategoryAttributeRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductCategoryAttributeRelation record);
}