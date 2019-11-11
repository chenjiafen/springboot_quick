package com.chenjiafeng.mapper;

import com.chenjiafeng.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.annotation.Resource;
import java.util.List;

@Mapper //爲了映射UserMapper去查詢sql

public interface UserMapper {
    public List<User> queryUserList();


    @Select("select * from users where id=#{id} ")
    public List<User> queryId(User user);

}
