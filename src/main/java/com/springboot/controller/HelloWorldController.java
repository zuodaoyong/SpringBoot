package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class HelloWorldController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return  "Hello Spring Boot";
    }
}
