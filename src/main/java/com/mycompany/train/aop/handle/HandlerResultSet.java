package com.mycompany.train.aop.handle;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HandlerResultSet {

    @Before("@within(com.mycompany.train.aop.anotation.MapResult)")
    public void beforeWithinAnnotation() {
        System.out.println("===============================");
    }


}