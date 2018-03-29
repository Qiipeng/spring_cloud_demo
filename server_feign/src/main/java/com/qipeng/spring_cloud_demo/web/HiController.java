package com.qipeng.spring_cloud_demo.web;

import com.qipeng.spring_cloud_demo.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试 Controller
 * Created by Qipeng on 2018/3/29.
 */
@Controller
public class HiController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam String name) {
        return schedualServiceHi.sayHiFromClient(name);
    }

}
