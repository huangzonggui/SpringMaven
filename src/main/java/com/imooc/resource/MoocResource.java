package com.imooc.resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.io.Resource;
import java.io.IOException;

/**
 * Created by hzg on 2016/9/9.
 */
public class MoocResource implements ApplicationContextAware{
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }

    public void resource() throws IOException {
        //F:\Workspaces\SpringMaven\src\main\resources\test.txt
       //Resource resource = applicationContext.getResource("file:F:\\Workspaces\\SpringMaven\\src\\main\\resources\\test.txt");
        //Resource resource = applicationContext.getResource("classpath:test.txt");
        //没写，就是默认依赖applicationContext创建方式，applicationContext的创建方式是根据classpath创建的
        Resource resource = applicationContext.getResource("test.txt");
        System.out.println(resource.getFilename());
        System.out.println("大小："+resource.contentLength());
    }
}
