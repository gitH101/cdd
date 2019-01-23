package com.example.user.mapper;

import com.example.common.mapper.MyMapper;
import com.example.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends MyMapper<User> {
}
