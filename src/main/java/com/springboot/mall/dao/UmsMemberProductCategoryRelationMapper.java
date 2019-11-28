package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberProductCategoryRelation;

public interface UmsMemberProductCategoryRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberProductCategoryRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberProductCategoryRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberProductCategoryRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberProductCategoryRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberProductCategoryRelation record);
}