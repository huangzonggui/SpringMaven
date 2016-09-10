package com.imooc.beanannotation.javabased;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
//    private String url;//    @Value("${jdbc.username}")

//    private String username;
//    @Value("${password}")
//    private String password;
//    @Bean
//    public MyDriverManager myDriverManager(){
//        return new MyDriverManager(url, username, password);
//    }

    //scope测试
//    @Bean(name = "scope")
//    @Scope(value = "prototype",proxyMode = ScopedProxyMode.DEFAULT)
//    public Store GetStringStore(){
//        return new StringStore();
//    }

    //string和integer测试
    @Autowired
    @Qualifier("stringStore")
    private Store<String> s1;

    @Autowired
    @Qualifier("integerStore")
    private Store<Integer> s2;

    @Bean
    public StringStore stringStore(){
        return new StringStore();
    }
    @Bean
    public IntegerStore integerStore(){
        return new IntegerStore();
    }
    @Bean(name = "stringStoreTest")
    public Store stringStoreTest(){
        //加载配置文件都会打印出来
//        System.out.println("s1:"+s1.getClass().getName());
//        System.out.println("s2:"+s2.getClass().getName());
        return new StringStore();
    }


}
