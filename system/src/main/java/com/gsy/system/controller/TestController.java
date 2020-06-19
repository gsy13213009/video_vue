package com.gsy.system.controller;

import com.gsy.server.domain.Test;
import com.gsy.server.service.TestService;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("test")
    public Test test() {
        return testService.list();
    }

}
