package com.springboot.mall.dao;

import com.springboot.mall.model.CmsPrefrenceArea;

public interface CmsPrefrenceAreaMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsPrefrenceArea record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsPrefrenceArea record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsPrefrenceArea selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsPrefrenceArea record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(CmsPrefrenceArea record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsPrefrenceArea record);
}