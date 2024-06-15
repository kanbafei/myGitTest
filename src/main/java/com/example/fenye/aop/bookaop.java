package com.example.fenye.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class bookaop {
    @Before(value = "execution(* com.example.fenye.controller.bookController.* (..))")
    public void t1(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("前置方法执行了，方法名："+name);
    }
}
