package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello(Map<String,String> map){
        map.put("hello","你好");
        return  "success";
    }
}
