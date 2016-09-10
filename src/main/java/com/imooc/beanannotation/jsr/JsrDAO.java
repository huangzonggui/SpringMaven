package com.imooc.beanannotation.jsr;

import org.springframework.stereotype.Repository;

/**
 * Created by hzg on 2016/9/10.
 */
@Repository
public class JsrDAO {
    public void save(){
        System.out.println("JsrDAO invoked.");
    }
}
