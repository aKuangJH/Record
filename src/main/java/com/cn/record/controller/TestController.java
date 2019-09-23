package com.cn.record.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
