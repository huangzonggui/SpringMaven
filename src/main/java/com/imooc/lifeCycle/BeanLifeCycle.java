package com.imooc.lifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by hzg on 2016/9/8.
 */
public class BeanLifeCycle {
//    方法一
//    implements InitializingBean,DisposableBean
//    @Override
//    public void destroy() throws Exception {
//        System.out.println("Bean InitializingBean;");
//    }
//    方法二
//    @Override
//    public void afterPropertiesSet() throws Exception {
//        System.out.println("Bean DisposableBean;");
//    }
//    public void start(){
//        System.out.println("Bean start;");
//    }
//    public void stop(){
//        System.out.println("Bean stop;");
//    }
//    方法三
    public void defaultInit(){
        System.out.println("Bean defaultInit");
    }
    public void defaultDestroy(){
        System.out.println("Bean defaultDestroy");
    }
}
