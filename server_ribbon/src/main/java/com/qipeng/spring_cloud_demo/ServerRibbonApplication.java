package com.qipeng.spring_cloud_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 服务消费者
 */
@EnableHystrix // 开启Hystrix
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrixDashboard // 开启Hystrix仪表盘
public class ServerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerRibbonApplication.class, args);
    }

    @Bean
    @LoadBalanced // 表示开启负载均衡
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
