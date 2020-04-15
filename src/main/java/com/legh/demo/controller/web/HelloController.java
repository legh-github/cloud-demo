package com.legh.demo.controller.web;

import com.legh.demo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    private HelloService helloService;

    @RequestMapping("/test")
    public String helloTest() {
        return helloService.sayHello();
    }
}
