package com.springboot.mall.dao;

import com.springboot.mall.model.PmsProduct;
import com.springboot.mall.model.PmsProductWithBLOBs;
import org.apache.ibatis.annotations.Param;

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

    List<PmsProduct> selectByIDPmsProduct(Long id);

    /**
     * 分页查询商品
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<PmsProduct> selectAllPmsProduct(Integer pageNum, Integer pageSize);

    /**
     * 根据name分页模糊查询商品
     * @param pageNum
     * @param pageSize
     * @param name
     * @return
     */
    List<PmsProduct> selectByNamePmsProduct(
        @Param("pageNum") Integer pageNum,
        @Param("pageSize") Integer pageSize,
        @Param("name") String name);
}