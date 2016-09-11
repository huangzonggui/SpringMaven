package com.imooc.aop.api;

/**
 * Created by hzg on 2016/9/11.
 */
public class BizLogicImpl implements BizLogic {
    @Override
    public String save() {
        System.out.println("BizLogicImpl:BizLogicImpl save.");
        return "BizLogicImpl save.";
//        throw new RuntimeException();
    }
}
