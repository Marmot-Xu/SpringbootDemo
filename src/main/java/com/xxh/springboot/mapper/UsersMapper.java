package com.xxh.springboot.mapper;

import com.xxh.springboot.model.Users;
import org.apache.ibatis.annotations.Param;

public interface UsersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
    Users login(@Param("name") String a, @Param("password") String b);
}