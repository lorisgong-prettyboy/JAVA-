package aopAno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

//创建增强类
@Component
@Aspect
public class UserProxy {
    //@Before 注解表示作为前置通知,在User类下的add方法之前
    @Before(value = "execution(* aopAno.User.add(..))")
    public void before(){//前置通知
        System.out.println("before....");
    }
/*    @AfterReturning(value = "execution(* aopAno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterreturning...");
    }
    @After(value = "execution(* aopAno.User.add(..))")
    public void after(){
        System.out.println("after.....");
    }
    @AfterThrowing("execution(* aopAno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }
    @Around("execution(* aopAno.User.add(..))")
    public void round(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕之前");
        //被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后");
    }*/
}
