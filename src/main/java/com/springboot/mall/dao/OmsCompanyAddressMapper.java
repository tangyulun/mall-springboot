package com.springboot.mall.dao;

import com.springboot.mall.model.OmsCompanyAddress;

public interface OmsCompanyAddressMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(OmsCompanyAddress record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(OmsCompanyAddress record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    OmsCompanyAddress selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(OmsCompanyAddress record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(OmsCompanyAddress record);
}