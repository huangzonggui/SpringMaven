package com.imooc.test.aop;

import com.imooc.aop.schema.advisors.service.InvokeService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by hzg on 2016/9/11.
 */
public class TestAOPSchemaAdvisors extends UnitTestBase {
    public TestAOPSchemaAdvisors() {
        super("classpath:spring-aop-schema-advisors.xml");
    }
    @Test
    public void testSave() {
        InvokeService invokeService = super.getBean("invokeService");
        invokeService.invoke();

        System.out.println();
        invokeService.invokeException();

    }
}
