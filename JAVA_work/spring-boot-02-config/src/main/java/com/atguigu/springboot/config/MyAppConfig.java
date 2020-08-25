package com.atguigu.springboot.config;

import com.atguigu.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
* @Configuration:指明当前类是一个配置类：就是替代当前的spring配置文件
*
* */
@Configuration
public class MyAppConfig {
    @Bean
    public HelloService helloService02(){
        System.out.println("配置类@Bean给容器中添加组件了");
        return new HelloService();
    }
}
