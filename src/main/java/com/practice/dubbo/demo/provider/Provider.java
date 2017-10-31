package com.practice.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * dubbo provider
 */
public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{
                "classpath:/dubbo-provider-service.xml"
        });
        context.start();
        System.in.read();
    }
}
