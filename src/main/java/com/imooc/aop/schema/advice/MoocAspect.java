package com.imooc.aop.schema.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by hzg on 2016/9/11.
 */
public class MoocAspect {
    public void before() {
        System.out.println("MoocAspect before.");
    }

    public void afterReturning() {
        System.out.println("MoocAspect afterReturning.");
    }

    public void afterThrowing() {
        System.out.println("MoocAspect afterThrowing.");
    }

    public void after() {
        System.out.println("MoocAspect after.");
    }

    public Object around(ProceedingJoinPoint pjp) {
        Object obj = null;
        try {
            System.out.println("MoocAspect arount 1.");
            obj=pjp.proceed();
            System.out.println("MoocAspect arount 2.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

    public Object aroundInit(ProceedingJoinPoint pjp,String bizName,int times){
        System.out.println(bizName + "  " + times);
        Object obj = null;
        try {
            System.out.println("MoocAspect arountInit 1.");
            obj=pjp.proceed();//执行AspectBiz中的init方法
            System.out.println("MoocAspect arountInit 2.");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return obj;
    }

}
