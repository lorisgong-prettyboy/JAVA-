package dao_annotation.service;



import dao_annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
//注解里面value的属性值可以不写
//默认值首字母小写
//UerService--uerService

/*@Component(value = "userService")//<bean id "userService" class=""/>*/
@Service
public class  UserService {
    //定义属性
    //不需要添加set方法
    //添加注入注解
    @Autowired//根据类型进行注入
    private UserDao userDao;

    public void add(){
        System.out.println("Service  add...");
        userDao.add();
    }

}


