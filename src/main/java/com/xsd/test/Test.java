package com.xsd.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xsd.bean.UserBean;

public class Test {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml");
        UserBean user = (UserBean) context.getBean("eric");
        System.out.println(user.getId());
        System.out.println(user.getName());
        System.out.println(user.getSex());
        System.out.println(user.getAge());
	}

}
