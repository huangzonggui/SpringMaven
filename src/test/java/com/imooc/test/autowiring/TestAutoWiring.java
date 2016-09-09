package com.imooc.test.autowiring;

import com.imooc.autowiring.AutoWiringService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Created by hzg on 2016/9/8.
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class TestAutoWiring extends UnitTestBase {
    public TestAutoWiring(){
        super("classpath:spring-autowiring.xml");
    }

    @Test
    public void testSay(){
        AutoWiringService autoWiringService=super.getBean("autoWiringService");
        autoWiringService.say("i am autoWiringService");
    }
}
