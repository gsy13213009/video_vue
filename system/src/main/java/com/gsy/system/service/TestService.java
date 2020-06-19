package com.gsy.system.service;

import com.gsy.system.domain.Test;
import com.gsy.system.mapper.TestMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }

}
