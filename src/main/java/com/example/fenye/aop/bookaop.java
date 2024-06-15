package com.example.fenye.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class bookaop {
//    @Before(value = "execution(* com.example.fenye.controller.bookController.* (..))")
//    public void t1(JoinPoint joinPoint){
//        String name = joinPoint.getSignature().getName();
//        System.out.println("前置方法执行了，方法名："+name);
//    }
//    @AfterReturning(value = "execution(* com.example.fenye.controller.bookController.* (..))",returning = "ret")
//    public void t2(JoinPoint joinPoint,Object ret)
//    {
//        String name = joinPoint.getSignature().getName();
//        System.out.println("result="+ret);
//        System.out.println("后置返回任务执行了，方法名："+name);
//    }
//    @After(value = "execution(* com.example.fenye.controller.bookController.* (..))")
//    public void t3(JoinPoint joinPoint)
//    {
//        String name = joinPoint.getSignature().getName();
//        System.out.println("后置返回任务执行了，方法名："+name);
//    }
    @Around(value = "execution(* com.example.fenye.controller.bookController.* (..))")
    public Object t4(ProceedingJoinPoint joinPoint) {
        Object result=null;
        try {
            System.out.println("前置任务");
             result=joinPoint.proceed();
            System.out.println("后置返回任务");
        } catch (Throwable e) {
            System.out.println("出现异常");
            throw new RuntimeException(e);
        }
        finally {
            System.out.println("后置任务，盖棺定论");
        }
        return result;
    }
}
