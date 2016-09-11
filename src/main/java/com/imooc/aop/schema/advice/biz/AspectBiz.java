package com.imooc.aop.schema.advice.biz;

/**
 * Created by hzg on 2016/9/11.
 */
public class AspectBiz {
    public void biz() {
        System.out.println("AspectBiz biz.");
//        throw new RuntimeException();
    }

    public void init(String bizName, int times) {
        System.out.println("AspectBiz init:" + bizName + " " + times);
    }
}
