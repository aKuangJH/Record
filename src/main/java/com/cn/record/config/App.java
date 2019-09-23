package com.cn.record.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description: 启动类
 * @author: JiaHao.Kuang
 * @create: 2019-09-23 11:08
 **/
@ComponentScan(basePackages = "com.cn.record")
@EnableAutoConfiguration
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
