package com.springboot.mall.dao;

import com.springboot.mall.model.CmsTopicCategory;

public interface CmsTopicCategoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsTopicCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsTopicCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsTopicCategory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsTopicCategory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsTopicCategory record);
}