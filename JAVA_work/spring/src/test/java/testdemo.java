import javafx.application.Application;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testdemo {

    @Test
    public void testAdd(){
        //1加载spring的配置文件
        BeanFactory context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2获取配置创建的对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1(){
        //1加载spring的配置文件
        ApplicationContext   context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2获取配置创建的对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }

    @Test
    public void testOrders(){
        //1加载spring的配置文件
        ApplicationContext   context =
                new ClassPathXmlApplicationContext("bean1.xml");
        //2获取配置创建的对象
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println(orders);
        orders.ordersTest();
    }
}


