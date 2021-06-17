package com.chp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
public class Users9999Application {
    public static void main(String[] args) {
        SpringApplication.run(Users9999Application.class,args);
    }
}
