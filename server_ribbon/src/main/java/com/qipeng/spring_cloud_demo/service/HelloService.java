package com.qipeng.spring_cloud_demo.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 测试 Service
 * Created by Qipeng on 2018/3/29.
 */
@Service
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    // 创建熔断器功能,并指定熔断方法
    @HystrixCommand(fallbackMethod = "hiError")
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class);
    }

    public String hiError(String name) {
        return "hi " + name + ", sorry Error!!!";
    }


}
