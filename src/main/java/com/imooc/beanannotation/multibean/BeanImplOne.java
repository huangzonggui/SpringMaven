package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by hzg on 2016/9/9.
 */
@Order(2)
//@Order这个注解只对数组有影响，对map没有影响
@Component
public class BeanImplOne implements BeanInterface{
}
