package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderReturnReason;

public interface OmsOrderReturnReasonMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsOrderReturnReason record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsOrderReturnReason record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsOrderReturnReason selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsOrderReturnReason record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsOrderReturnReason record);
}