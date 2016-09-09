package com.imooc.aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * Created by hzg on 2016/9/8.
 */
public class BeanName implements BeanNameAware, ApplicationContextAware {

    private String beanName;

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
        System.out.println("BeanName:" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setapplicationContext:" + applicationContext.getBean(this.beanName).hashCode());
    }
}
