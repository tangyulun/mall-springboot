package com.springboot.mall.dao;

import com.springboot.mall.model.CmsSubject;

public interface CmsSubjectMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsSubject selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(CmsSubject record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsSubject record);
}