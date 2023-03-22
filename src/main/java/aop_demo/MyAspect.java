package aop_demo;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Pointcut("execution(* aop_demo.UserServiceImpl.printUser(..))")
    public void cut() {}

    @Before("cut()")
    public void before() {
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
}
