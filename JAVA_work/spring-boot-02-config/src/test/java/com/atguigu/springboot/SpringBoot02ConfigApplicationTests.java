package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
/*
*
* 可以在测试期间很方便地
*
* */
@RunWith(SpringRunner.class)//单元测试用spring的驱动器来跑
@SpringBootTest
class SpringBoot02ConfigApplicationTests {
   @Autowired
    Person person;
   @Autowired
    ApplicationContext ioc;
   @Test
   public void testHelloService(){
       boolean b = ioc.containsBean("helloService02");
       System.out.println(b);
   }
    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
