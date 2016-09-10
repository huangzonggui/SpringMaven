package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

/**
 * Created by hzg on 2016/9/9.
 */
@Configuration
@ImportResource("classpath:config.xml")
public class StoreConfig {

      //bean测试
//    @Bean(name = "stringStore" ,initMethod = "init",destroyMethod = "destroy")
//    public Store GetStringStore(){
//        return new StringStore();
//    }
    //配置测试
//    @Value("${url}")
//    private String url;
//    @Value("${jdbc.username}")
//    private String username;
//    @Value("${password}")
//    private String password;
//    @Bean
//    public MyDriverManager myDriverManager(){
//        return new MyDriverManager(url, username, password);
//    }

    //scope测试
    @Bean(name = "stringStore")
    @Scope(value = "prototype",proxyMode = ScopedProxyMode.DEFAULT)
    public Store GetStringStore(){
        return new StringStore();
    }



}
