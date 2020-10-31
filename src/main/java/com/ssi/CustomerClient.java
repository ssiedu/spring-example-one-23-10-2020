package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
	
		
		ApplicationContext context=new ClassPathXmlApplicationContext("aw.xml");
		Customer customer=context.getBean("customer",Customer.class);
		System.out.println(customer);
		
		/*
		ApplicationContext context=new ClassPathXmlApplicationContext("trial.xml");
		//Customer customer=context.getBean("customer",Customer.class);
		//System.out.println(customer);
		Customer c1=context.getBean("c1",Customer.class);
		Customer c2=context.getBean("c2",Customer.class);
		Customer c3=context.getBean("c3",Customer.class);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		*/
	}

}
