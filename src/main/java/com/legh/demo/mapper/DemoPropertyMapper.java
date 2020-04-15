package com.legh.demo.mapper;

import com.legh.demo.base.MyMapper;
import com.legh.demo.model.domain.DemoProperty;

import java.util.List;

public interface DemoPropertyMapper extends MyMapper<DemoProperty> {
    List<DemoProperty> listByName(String propertyName);
}