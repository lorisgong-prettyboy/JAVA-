import Orders.Orders_xiaohui;
import aotowire.Emp;
import config.SpringConfig;
import dao_annotation.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_spring_demo1 {
    @Test
    public void testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
     stu.test();
    }
    @Test
    public void testbook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);
        book.test();
        System.out.println(book);
    }
    @Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
         Course course = context.getBean("myBean", Course.class);;
        course.test();
    }
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders_xiaohui orders = context.getBean("orders", Orders_xiaohui.class);
        System.out.println("第四步输出实例化对象");
        System.out.println(orders);
        orders.destoryMethod();
    }
    @Test
    public  void test5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp",Emp.class);
        System.out.println(emp);
    }
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_dao1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testService1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean_dao1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
    @Test
    public void testService2(){
        //加载配置类，注解的形式
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
