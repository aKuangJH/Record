package com.cn.record.controller;

import com.cn.record.entity.User;
import com.cn.record.entity.ext.People;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: JiaHao.Kuang
 * @create: 2019-09-23 11:26
 **/
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("test")
    public Map<String, String> testpro(){
        Map<String, String> map = new HashMap<>();
        map.put("success", "hello");
        return map;
    }

    /**
     * 动态代理基础使用
     * @return
     */
    @ResponseBody
    @RequestMapping("proxytest")
    public String proxyForPeople(){
        User user = new User("aKuang", "coding");

        People userProxy = (People) Proxy.newProxyInstance(user.getClass().getClassLoader(),
                user.getClass().getInterfaces(), (proxy, methods, args) -> {
                    if(methods.getName().equals("toExcute")){
                        System.out.println("preparing......");
                        return methods.invoke(user, args);
                    }
                    if(methods.getName().equals("getStatus")){
                        System.out.println("status types [coding, rest, learning]");
                        return methods.invoke(user, args);
                    }
                    return null;
                });

        userProxy.toExcute();
        userProxy.getStatus();
        return "success";
    }


}
