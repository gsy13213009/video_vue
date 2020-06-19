package com.gsy.system.controller;

import com.gsy.system.domain.Test;
import com.gsy.system.service.TestService;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping("test")
    public List<Test> test() {
        return testService.list();
    }

}
