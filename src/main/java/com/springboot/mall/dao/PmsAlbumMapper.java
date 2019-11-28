package com.springboot.mall.dao;

import com.springboot.mall.model.PmsAlbum;

public interface PmsAlbumMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsAlbum record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsAlbum record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsAlbum selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsAlbum record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsAlbum record);
}