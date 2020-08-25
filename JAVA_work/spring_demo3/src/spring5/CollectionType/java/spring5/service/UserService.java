package spring5.service;

import org.springframework.stereotype.Component;
//注解里面value的属性值可以不写
//默认值首字母小写
//UerService--uerService

@Component(value = "userService")//<bean id "userService" class=""/>
public class  UserService {
    public void add(){
        System.out.println();
    }
}
