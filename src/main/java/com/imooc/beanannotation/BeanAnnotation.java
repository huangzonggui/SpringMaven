package com.imooc.beanannotation;

import org.springframework.stereotype.Component;

/**
 * Created by hzg on 2016/9/9.
 */
//@Component("bean")如果不加名字默认是将类名的第一个字母小写
@Component
public class BeanAnnotation {
    public static void say(String arg){
        System.out.println("beanAnnotation："+arg);
    }
}
