package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderSetting;

public interface OmsOrderSettingMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsOrderSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsOrderSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsOrderSetting selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsOrderSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsOrderSetting record);
}