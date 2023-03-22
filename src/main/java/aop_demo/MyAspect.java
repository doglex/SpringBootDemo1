package aop_demo;

import org.aspectj.lang.annotation.*;

@Aspect
public class MyAspect {
    @Before("execution(* aop_demo.UserServiceImpl.printUser(..))")
    public void before() {
        System.out.println("before -------");
    }

    @After("execution(* aop_demo.UserServiceImpl.printUser(..))")
    public void after() {
        System.out.println("after -------");
    }

    @AfterReturning("execution(* aop_demo.UserServiceImpl.printUser(..))")
    public void afterReturning() {
        System.out.println("AfterReturning -------");
    }

    @AfterThrowing("execution(* aop_demo.UserServiceImpl.printUser(..))")
    public void afterThrowing() {
        System.out.println("AfterThrowing -------");
    }
}
