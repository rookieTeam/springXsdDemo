package com.xsd.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xsd.bean.UserBean;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
	}

}
