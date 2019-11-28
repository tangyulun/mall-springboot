package com.springboot.mall.dao;

import com.springboot.mall.model.PmsBrand;

public interface PmsBrandMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsBrand selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(PmsBrand record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsBrand record);
}