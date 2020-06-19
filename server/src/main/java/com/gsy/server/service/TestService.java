package com.gsy.server.service;

import com.gsy.server.domain.Test;
import com.gsy.server.domain.TestExample;
import com.gsy.server.mapper.TestMapper;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        TestExample example = new TestExample();
        example.createCriteria().andIdEqualTo("1");
        example.setOrderByClause("id desc");
        return testMapper.selectByExample(example);
    }

}
