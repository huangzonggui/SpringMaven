package com.imooc.aop.schema.advice;

/**
 * Created by hzg on 2016/9/11.
 */
public class FitImpl implements Fit {

    @Override
    public void filter() {
        System.out.println("FitImpl filter.");
    }
}
