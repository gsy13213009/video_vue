package com.gsy.server.mapper;

import com.gsy.server.domain.Test;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    List<Test> list();
}
