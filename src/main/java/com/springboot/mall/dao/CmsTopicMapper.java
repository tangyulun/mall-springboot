package com.springboot.mall.dao;

import com.springboot.mall.model.CmsTopic;

public interface CmsTopicMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsTopic selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(CmsTopic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsTopic record);
}