package com.gsy.server.service;

import com.gsy.server.domain.Test;
import com.gsy.server.mapper.TestMapper;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public Test list() {
        return testMapper.selectByPrimaryKey("1");
    }

}
