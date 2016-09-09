package com.imooc.test.aware;

import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hzg on 2016/9/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAware extends UnitTestBase {
    public TestAware(){
        super("classpath:spring-aware.xml");
    }

    @Test
    public void testApplicationContext(){
        System.out.println("testApplicationContext："+super.getBean("applicationContext").hashCode());
    }

    @Test
    public void testBeanName(){
        System.out.println("testBeanName："+super.getBean("beanName").hashCode());
    }
}
