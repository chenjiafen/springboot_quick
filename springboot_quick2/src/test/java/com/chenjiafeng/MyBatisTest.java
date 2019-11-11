package com.chenjiafeng;


import com.chenjiafeng.domain.User;
import com.chenjiafeng.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootQuick2Application.class) //需要加引導類
public class MyBatisTest {

    @Resource
    private UserMapper usermapper;

    @Test
    public void test(){
     List<User> users=usermapper.queryUserList();
     System.out.println("用戶數據"+users);
    }

    @Test
    public void test01(){
        User u=new User();
        u.setId(1);
       List<User> u1= usermapper.queryId(u);
       System.out.println(u1);
    }
}
