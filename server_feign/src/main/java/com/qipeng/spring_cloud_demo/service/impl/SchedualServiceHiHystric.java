package com.qipeng.spring_cloud_demo.service.impl;

import com.qipeng.spring_cloud_demo.service.SchedualServiceHi;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Qipeng on 2018/3/29.
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClient(@RequestParam(value = "name") String name) {
        return "sorry " + name;
    }
}
