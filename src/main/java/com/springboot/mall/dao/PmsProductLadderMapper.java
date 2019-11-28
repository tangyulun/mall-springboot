package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductLadder;

public interface PmsProductLadderMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductLadder record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductLadder record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductLadder selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductLadder record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductLadder record);
}