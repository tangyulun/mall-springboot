package com.springboot.mall.dao;

import com.springboot.mall.model.UmsIntegrationChangeHistory;

public interface UmsIntegrationChangeHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsIntegrationChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsIntegrationChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsIntegrationChangeHistory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsIntegrationChangeHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsIntegrationChangeHistory record);
}