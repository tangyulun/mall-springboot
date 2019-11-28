package com.springboot.mall.dao;

import com.springboot.mall.model.CmsHelpCategory;

public interface CmsHelpCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsHelpCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsHelpCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsHelpCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsHelpCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsHelpCategory record);
}