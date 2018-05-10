package com.kgc.ioc.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component("beanA")
public class BeanA {
	

	@Autowired
	private BeanB b;
	// 写一个setter方法
	
	public static void main(String[] args) {
		
		ApplicationContext atc = new ClassPathXmlApplicationContext("applicationContext-anno.xml");
		
		BeanA a = (BeanA)atc.getBean("beanA");
		
		a.b.run();
	}
	
}
