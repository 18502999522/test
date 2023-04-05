package com.yf.model.mapper;

import com.yf.entity.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    //Java描述形参有两个词：paramter  argument
    User login(@Param("username") String username, @Param("pwd") String pwd);

    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}