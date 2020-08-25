package com.springboot01helloworldquick;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*@ResponseBody
@Controller*/
@RestController
public class HellowController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
