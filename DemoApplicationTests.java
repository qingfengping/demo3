package com.example.demo;

import com.example.demo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoApplicationTests {

    @Resource
    UserDao userDao;
    @Test
    void contextLoads() {
        System.out.println(userDao.getUser("mike2"));
        System.out.println(userDao.getUser("mike2"));

    }


}
