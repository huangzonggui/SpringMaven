package com.imooc.beanannotation.injection.service;

import com.imooc.beanannotation.injection.dao.InjectionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InjectionServiceImpl implements InjectionService {
//	@Autowired
	private InjectionDAO injectionDAO;

	//构造器注入,这个injectionDAO对应的spring-injection.xml中的构造器constructor-org name
	@Autowired
	public InjectionServiceImpl(InjectionDAO injectionDAO){
		this.injectionDAO=injectionDAO;
	}

	//设值注入
//	@Autowired
//	public void setInjectionDAO(InjectionDAO injectionDAO) {
//		this.injectionDAO = injectionDAO;
//	}

	@Override
	public void save(String arg) {
		//模拟业务操作
		System.out.println("Service接收参数："+arg);
		arg=arg+":"+this.hashCode();
		injectionDAO.save(arg);
	}
	

}
