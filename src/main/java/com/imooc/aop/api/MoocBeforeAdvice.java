package com.imooc.aop.api;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by hzg on 2016/9/11.
 */
public class MoocBeforeAdvice implements MethodBeforeAdvice{
    @Override
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println("MoocBeforeAdvice:" + method.getName() + "  " + target.getClass().getName());
    }
}
