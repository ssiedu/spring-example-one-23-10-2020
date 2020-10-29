package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeClient {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("info.xml");
		Employee employee=context.getBean("employee",Employee.class);
		System.out.println(employee);

	}

}
