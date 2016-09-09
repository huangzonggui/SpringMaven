package com.imooc.test.beanannotation;

import com.imooc.beanannotation.BeanAnnotation;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hzg on 2016/9/9.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestBeanAnnotation extends UnitTestBase {
    public TestBeanAnnotation(){
        super("classpath:spring-beanannotation.xml");
    }

    @Test
    public void testBeanAnnotion(){
        BeanAnnotation beanAnnotation = super.getBean("beanAnnotation");
        beanAnnotation.say("this is beanAnnotation");
    }
}
