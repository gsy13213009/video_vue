package com.gsy.system.mapper;

import com.gsy.system.domain.Test;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {

    List<Test> list();
}
