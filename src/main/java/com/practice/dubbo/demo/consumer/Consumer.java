package com.practice.dubbo.demo.consumer;

import com.practice.dubbo.demo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:/dubbo-consumer-service.xml"
        });
        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("DengXin!");
        System.out.println(hello);
    }
}
