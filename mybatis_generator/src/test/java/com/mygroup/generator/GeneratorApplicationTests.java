package com.mygroup.generator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeneratorApplicationTests {

    @Autowired
    private UserMapper userMapper;
    @Test
    void contextLoads() {
        userMapper.selectAll().forEach(System.out::println);
    }

}
