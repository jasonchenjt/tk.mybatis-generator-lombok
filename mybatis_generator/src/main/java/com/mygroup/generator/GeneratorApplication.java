package com.mygroup.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(value = "com.mygroup.generator.domain.mapper")
public class GeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GeneratorApplication.class, args);
    }

}
