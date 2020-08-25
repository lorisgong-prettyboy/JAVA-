import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring5.service.UserService;

public class TestSpringDemo {
    @Test
    public void testService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("src/spring5/CollectionType/resources/bean2.xml");
        UserService userService =context.getBean("userService",UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
