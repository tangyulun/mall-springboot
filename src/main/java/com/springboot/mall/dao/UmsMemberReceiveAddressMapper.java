package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberReceiveAddress;

public interface UmsMemberReceiveAddressMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberReceiveAddress record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberReceiveAddress record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberReceiveAddress selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberReceiveAddress record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberReceiveAddress record);
}