package com.springboot.mall.dao;

import com.springboot.mall.model.PmsFeightTemplate;

public interface PmsFeightTemplateMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsFeightTemplate record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsFeightTemplate record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsFeightTemplate selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsFeightTemplate record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsFeightTemplate record);
}