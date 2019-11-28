package com.springboot.mall.dao;

import com.springboot.mall.model.CmsTopicComment;

public interface CmsTopicCommentMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsTopicComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsTopicComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsTopicComment selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsTopicComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsTopicComment record);
}