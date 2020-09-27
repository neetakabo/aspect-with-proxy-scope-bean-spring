package com.example.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class TestAspect {

    @Before("execution(* com.example.demo.PrototypeBean.doSomething(..))")
    public void before(JoinPoint joinPoint){
        System.out.println("In the aspect before doing something!");
    }

    @After("execution(* com.example.demo.PrototypeBean.doSomething(..))")
    public void after(JoinPoint joinPoint){
        System.out.println("In the aspect after doing something!");
        System.out.println("------------------------------------");
    }
}
