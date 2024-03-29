package com.chenjiafeng.Controller;

import com.chenjiafeng.domain.User;
import com.chenjiafeng.mapper.UserMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class MybatisController {

    @Resource
    private UserMapper userMapper;

    @RequestMapping(value = "/query",method = RequestMethod.GET)
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        System.err.println(users.size());
        return users;
    }

    @RequestMapping(value = "/queryid",method = RequestMethod.GET)
    public List<User> queryId(@RequestParam User user){
        List<User> users=   userMapper.queryId(user);
        return users;

    }

}
