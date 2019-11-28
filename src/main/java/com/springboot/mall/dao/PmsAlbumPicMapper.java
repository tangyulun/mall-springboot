package com.springboot.mall.dao;

import com.springboot.mall.model.PmsAlbumPic;

public interface PmsAlbumPicMapper {
    /**
     *
     * @mbggenerated 2019-11-24
     */
    int deleteByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insert(PmsAlbumPic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int insertSelective(PmsAlbumPic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    PmsAlbumPic selectByPrimaryKey(Long id);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKeySelective(PmsAlbumPic record);

    /**
     *
     * @mbggenerated 2019-11-24
     */
    int updateByPrimaryKey(PmsAlbumPic record);
}