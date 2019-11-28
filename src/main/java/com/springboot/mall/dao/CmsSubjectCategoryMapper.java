package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubjectCategory;

public interface CmsSubjectCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsSubjectCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsSubjectCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsSubjectCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsSubjectCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsSubjectCategory record);
}