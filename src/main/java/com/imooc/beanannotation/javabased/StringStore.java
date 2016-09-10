package com.imooc.beanannotation.javabased;

/**
 * Created by hzg on 2016/9/9.
 */
public class StringStore implements Store<String>{
    public void init(){
        System.out.println("This is init.");
    }

    public void destroy(){
        System.out.println("This is destroy.");
    }
}
