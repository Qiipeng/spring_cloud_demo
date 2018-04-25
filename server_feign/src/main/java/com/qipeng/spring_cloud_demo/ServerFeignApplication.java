package com.qipeng.spring_cloud_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients // 开启 Feign 功能
@EnableEurekaClient
@SpringBootApplication
public class ServerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerFeignApplication.class, args);
    }
}
