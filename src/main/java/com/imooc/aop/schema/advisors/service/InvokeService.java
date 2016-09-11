package com.imooc.aop.schema.advisors.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.PessimisticLockingFailureException;
import org.springframework.stereotype.Service;

/**
 * Created by hzg on 2016/9/11.
 */
@Service
public class InvokeService {

    public void invoke() {
        System.out.println("InvokeService run ......");
    }

    public void invokeException() {
        throw new PessimisticLockingFailureException("ahahaha wo shi excetion");
    }
}
