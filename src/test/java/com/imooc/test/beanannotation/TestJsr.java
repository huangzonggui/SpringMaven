package com.imooc.test.beanannotation;

import com.imooc.beanannotation.jsr.JsrService;
import com.imooc.test.base.UnitTestBase;
import org.junit.Test;

/**
 * Created by hzg on 2016/9/10.
 */
public class TestJsr extends UnitTestBase {
    public TestJsr(){
        super("classpath*:spring-beanannotation.xml");
    }

    @Test
    public void testSave() {
        JsrService service = getBean("jsrService");
        service.save();
    }
}
