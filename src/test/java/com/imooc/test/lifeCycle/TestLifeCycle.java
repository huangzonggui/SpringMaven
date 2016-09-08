package com.imooc.test.lifeCycle;

import com.imooc.lifeCycle.BeanLifeCycle;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hzg on 2016/9/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestLifeCycle extends UnitTestBase{
    public TestLifeCycle(){
        super("classpath*:spring-lifeCycle.xml");
    }

    @Test
    public void testStartAndStop(){
        super.getBean("beanLifeCycle");
    }
}
