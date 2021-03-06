package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

/*   @RequestMapping({"/","/index.html"})
    public String index(){
        return "index";
    }*/
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){

        return "Hello World";
    }

    //查出一些数据在页面上显示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

}
