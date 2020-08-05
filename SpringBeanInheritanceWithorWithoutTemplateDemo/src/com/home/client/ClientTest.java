package com.home.client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.home.model.Employee;



public class ClientTest {

	public static void main(String[] args) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext("BeansTemplate.xml");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee);
		((AbstractApplicationContext) context).close();
		
	}

}
