package com.springboot.mall.dao;

import com.springboot.mall.model.PmsComment;

public interface PmsCommentMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsComment selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeyWithBLOBs(PmsComment record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsComment record);
}