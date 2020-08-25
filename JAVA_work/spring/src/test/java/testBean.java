import bean.Emp;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;

public class testBean {
    @Test
    public void testbean1(){
        //1加载spring的配置文件
        BeanFactory context =
                new ClassPathXmlApplicationContext("bean2.xml");
        //2获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testbean2(){
        //1加载spring的配置文件
        BeanFactory context =
                new ClassPathXmlApplicationContext("bean4.xml");
        //2获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();
    }
}
