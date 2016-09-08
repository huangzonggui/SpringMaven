package com.imooc.test.bean;

import com.imooc.bean.BeanScope;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hzg on 2016/9/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanScope extends UnitTestBase{
    public TestBeanScope(){
        //要不要*都可以
        super("classpath*:spring-beanscope.xml");
    }

    @Test
    public void testSay(){
        BeanScope beanScope = super.getBean("beanScope");
        beanScope.say();

        BeanScope beanScope1 = super.getBean("beanScope");
        beanScope1.say();
    }
}
