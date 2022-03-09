package com.fastcampus.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

import java.time.LocalDateTime;

@SpringBootTest
class UserTest {

    @Autowired
    User user;

    @Test
    void test() {
        user.setEmail("willy@kim.com");
        System.out.println(">>> " + user);

//        user.setCreatedAt(LocalDateTime.now());
//        User user2 = user;
//        System.out.println(user2.getCreatedAt());
//
//        user2.setCreatedAt(LocalDateTime.now());
//        System.out.println(user2.getCreatedAt());

    }
}