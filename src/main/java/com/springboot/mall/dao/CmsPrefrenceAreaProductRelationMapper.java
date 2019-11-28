package com.springboot.mall.dao;

import com.springboot.mall.model.CmsPrefrenceAreaProductRelation;

public interface CmsPrefrenceAreaProductRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsPrefrenceAreaProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsPrefrenceAreaProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsPrefrenceAreaProductRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsPrefrenceAreaProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsPrefrenceAreaProductRelation record);
}