package com.boot.spring;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableEurekaServer
@MapperScan(basePackages = "com.boot.spring.mapper")
public class MainApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(MainApplication.class);
    }
}
