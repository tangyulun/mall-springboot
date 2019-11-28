package com.springboot.mall.dao;

import com.springboot.mall.model.UmsMemberRuleSetting;

public interface UmsMemberRuleSettingMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(UmsMemberRuleSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(UmsMemberRuleSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    UmsMemberRuleSetting selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(UmsMemberRuleSetting record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(UmsMemberRuleSetting record);
}