package com.darenzai.Service;

import org.aspectj.lang.ProceedingJoinPoint;


public class Aspect {


    public Object log(ProceedingJoinPoint joinPoint) throws Throwable{

        System.out.println("Start log"+joinPoint.getSignature());

        Object object =joinPoint.proceed();

        System.out.println("End log"+joinPoint.getSignature());



        return object;
    }
}
