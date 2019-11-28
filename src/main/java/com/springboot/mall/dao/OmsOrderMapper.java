package com.springboot.mall.dao;

import com.springboot.mall.model.OmsOrder;

public interface OmsOrderMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsOrder record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsOrder record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsOrder selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsOrder record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsOrder record);
}