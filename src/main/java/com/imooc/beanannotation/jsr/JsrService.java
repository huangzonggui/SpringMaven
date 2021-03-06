package com.imooc.beanannotation.jsr;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by hzg on 2016/9/10.
 */
//@Service
@Named
public class JsrService {
//    @Resource
//    @Inject
    private JsrDAO jsrDAO;

//    @Resource
    @Inject
//    用@Named是防止两个JsrDAO注入到IoC中
    public void setJsrDAO(@Named("jsrDAO") JsrDAO jsrDAO) {
        this.jsrDAO = jsrDAO;
    }

    @PostConstruct
    public void init() {
        System.out.println("JsrService init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JsrService destroy.");
    }

    public void save(){
        jsrDAO.save();
    }
}
