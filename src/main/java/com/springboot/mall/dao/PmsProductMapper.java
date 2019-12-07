package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProduct;
import com.springboot.mall.model.PmsProductWithBLOBs;

import java.util.List;

public interface PmsProductMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsProductWithBLOBs selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(PmsProductWithBLOBs record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsProduct record);

    /**
     * 分页查询商品
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsProduct> selectAllPmsProduct(Integer pageNum, Integer pageSize);
}