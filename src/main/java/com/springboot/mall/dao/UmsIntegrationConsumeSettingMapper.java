package com.springboot.mall.dao;

import com.springboot.mall.model.UmsIntegrationConsumeSetting;

public interface UmsIntegrationConsumeSettingMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsIntegrationConsumeSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsIntegrationConsumeSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsIntegrationConsumeSetting selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsIntegrationConsumeSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsIntegrationConsumeSetting record);
}