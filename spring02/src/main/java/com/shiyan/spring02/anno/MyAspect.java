package com.shiyan.spring02.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(void com.shiyan.spring02.anno.Target.save())")
    public void before(){
        System.out.println("前置增强...");
    }
}
