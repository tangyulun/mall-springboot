package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderOperateHistory;

public interface OmsOrderOperateHistoryMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsOrderOperateHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsOrderOperateHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsOrderOperateHistory selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsOrderOperateHistory record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsOrderOperateHistory record);
}