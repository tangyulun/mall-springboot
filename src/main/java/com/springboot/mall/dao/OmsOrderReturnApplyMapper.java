package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrderReturnApply;

public interface OmsOrderReturnApplyMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsOrderReturnApply record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsOrderReturnApply record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsOrderReturnApply selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsOrderReturnApply record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsOrderReturnApply record);
}