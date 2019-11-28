package com.springboot.mall.dao;

import com.springboot.mall.model.PmsCommentReplay;

public interface PmsCommentReplayMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsCommentReplay record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsCommentReplay record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsCommentReplay selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsCommentReplay record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsCommentReplay record);
}