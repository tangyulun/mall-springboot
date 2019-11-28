package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubjectProductRelation;

public interface CmsSubjectProductRelationMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsSubjectProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsSubjectProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsSubjectProductRelation selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsSubjectProductRelation record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsSubjectProductRelation record);
}