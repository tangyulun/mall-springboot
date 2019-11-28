package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProductFullReduction;

public interface PmsProductFullReductionMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductFullReduction record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductFullReduction record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductFullReduction selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductFullReduction record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProductFullReduction record);
}