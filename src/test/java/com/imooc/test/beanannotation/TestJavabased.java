package com.imooc.test.beanannotation;

import com.imooc.beanannotation.javabased.IntegerStore;
import com.imooc.beanannotation.javabased.MyDriverManager;
import com.imooc.beanannotation.javabased.Store;
import com.imooc.beanannotation.javabased.StringStore;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hzg on 2016/9/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestJavabased extends UnitTestBase{
    public TestJavabased(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void test(){
        Store store = super.getBean("stringStore");
        System.out.println(store.getClass().getName());
    }

    @Test
    public void testMyDriverManager(){
        MyDriverManager myDriverManager=super.getBean("myDriverManager");
        System.out.println(myDriverManager.getClass().getName());
    }

    @Test
    public void testScope(){
        StringStore stringStore = super.getBean("scope");
        System.out.println(stringStore.hashCode());

        StringStore stringStore2 = super.getBean("scope");
        System.out.println(stringStore2.hashCode());

    }

//    @Test
//    public void testStringStore(){
//        StringStore stringStore = super.getBean("stringStore");
//        System.out.println(stringStore.getClass().getName());
//    }
//    @Test
//    public void testIntegerStore(){
//        IntegerStore integerStore = super.getBean("integerStore");
//        System.out.println(integerStore.getClass().getName());
//    }
    @Test
    public void testG(){
        StringStore stringStore=super.getBean("stringStoreTest");
    }
}
