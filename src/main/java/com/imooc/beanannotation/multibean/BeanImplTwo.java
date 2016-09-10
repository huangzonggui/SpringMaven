package com.imooc.beanannotation.multibean;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Created by hzg on 2016/9/9.
 */
@Order(1)
@Component
public class BeanImplTwo implements BeanInterface{
}
