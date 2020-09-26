package com.shiyan.spring02.anno2;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class MyAspect {

    @Before("execution(void com.shiyan.spring02.anno2.Target.save())")
    public void before(){
        System.out.println("前置增强...");
    }
}
