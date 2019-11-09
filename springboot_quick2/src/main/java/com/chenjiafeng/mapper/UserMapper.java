package com.chenjiafeng.mapper;

import com.chenjiafeng.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper //爲了映射UserMapper去查詢sql

public interface UserMapper {
    public List<User> queryUserList();
}
