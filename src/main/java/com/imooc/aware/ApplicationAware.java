package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by hzg on 2016/9/8.
 */
public class ApplicationAware implements ApplicationContextAware{
    //初始化的时候就调用这个方法了，即使test方法里面没有内容
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContext:"+applicationContext.getBean("applicationContext").hashCode());
    }
}
