package aop_demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class MyAspect {

    @DeclareParents(value= "aop_demo.UserServiceImpl", defaultImpl=UserValidatorImpl.class)
    public UserValidator userValidator;

    @Pointcut("execution(* aop_demo.UserServiceImpl.printUser(..))")
    public void cut() {}

    @Before("cut() && args(user)")
    public void before(JoinPoint p, User user) {
        System.out.println("before user:" + user);
        System.out.println("before p:" + Arrays.toString(Arrays.stream(p.getArgs()).toArray()));
        System.out.println("before -------");
    }

    @After("cut()")
    public void after() {
        System.out.println("after -------");
    }

    @AfterReturning("cut()")
    public void afterReturning() {
        System.out.println("AfterReturning -------");
    }

    @AfterThrowing("cut()")
    public void afterThrowing() {
        System.out.println("AfterThrowing -------");
    }

    @Around("cut()")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("before around!"); // 比@Before还前面
        jp.proceed();  // 调用原方法，当然也可以替代为其他方法
        System.out.println("after around!"); // 比@After还后面
    }
}
