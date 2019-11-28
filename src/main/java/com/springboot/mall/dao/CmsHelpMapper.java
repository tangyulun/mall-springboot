package com.springboot.mall.dao;

import com.springboot.mall.model.CmsHelp;

public interface CmsHelpMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    CmsHelp selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(CmsHelp record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(CmsHelp record);
}