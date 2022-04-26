package com.example.boot_web2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

//指定原生servlet组件位置
//@ServletComponentScan(basePackages = "com.example.boot_web2.servlet")
@MapperScan("com.example.boot_web2.mapper")
@SpringBootApplication
public class BootWeb2Application {

    public static void main(String[] args) {
        SpringApplication.run(BootWeb2Application.class, args);
    }

}
