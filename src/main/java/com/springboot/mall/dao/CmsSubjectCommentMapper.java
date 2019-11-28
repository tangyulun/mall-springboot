package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubjectComment;

public interface CmsSubjectCommentMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsSubjectComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsSubjectComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsSubjectComment selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsSubjectComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsSubjectComment record);
}