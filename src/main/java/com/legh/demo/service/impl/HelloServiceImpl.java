package com.legh.demo.service.impl;

import com.legh.demo.mapper.DemoPropertyMapper;
import com.legh.demo.model.domain.DemoProperty;
import com.legh.demo.service.HelloService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HelloServiceImpl implements HelloService {
    @Resource
    private DemoPropertyMapper demoPropertyMapper;

    @Override
    public String sayHello() {
        List<DemoProperty> dpList = demoPropertyMapper.listByName("3");
        if (dpList == null || dpList.size() == 0) {
            return "not found";
        }
        DemoProperty dp = dpList.get(0);
        return dp.getPropertyCode();
    }
}
