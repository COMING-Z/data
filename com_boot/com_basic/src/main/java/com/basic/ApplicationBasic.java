package com.basic;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationBasic {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationBasic.class,args);
        System.out.println("测试成功");
    }
}
