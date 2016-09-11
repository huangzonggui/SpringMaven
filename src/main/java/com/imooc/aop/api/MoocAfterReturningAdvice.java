package com.imooc.aop.api;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by hzg on 2016/9/11.
 */
public class MoocAfterReturningAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("MoocAfterReturningAdvice :" + method.getName() + " " + target.getClass().getName() + "　" + returnValue);
    }
}
