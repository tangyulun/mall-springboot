package com.springboot.mall.dao;

import com.springboot.mall.model.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     *
     * @mbggenerated 2019-11-26
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-26
     */
    int insert(User record);

    /**
     *
     * @mbggenerated 2019-11-26
     */
    int insertSelective(User record);

    /**
     *
     * @mbggenerated 2019-11-26
     */
    User selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-11-26
     */
    int updateByPrimaryKeySelective(User record);

    /**
     *
     * @mbggenerated 2019-11-26
     */
    int updateByPrimaryKey(User record);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    Integer toLogin(@Param("username") String username, @Param("password") String password);
}