package com.qipeng.spring_cloud_demo.web;

import com.qipeng.spring_cloud_demo.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试 Controller
 * Created by Qipeng on 2018/3/29.
 */
@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    @ResponseBody
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }

}
