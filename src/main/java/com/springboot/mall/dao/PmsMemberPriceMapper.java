package com.springboot.mall.dao;

import com.springboot.mall.model.PmsMemberPrice;

public interface PmsMemberPriceMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsMemberPrice record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsMemberPrice record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsMemberPrice selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsMemberPrice record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsMemberPrice record);
}