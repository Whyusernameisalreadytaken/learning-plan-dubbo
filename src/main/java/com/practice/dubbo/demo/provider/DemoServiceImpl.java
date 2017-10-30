package com.practice.dubbo.demo.provider;

import com.practice.dubbo.demo.service.DemoService;

public class DemoServiceImpl implements DemoService {
    /**
     * dubbo服务方法
     *
     * @return
     */
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
