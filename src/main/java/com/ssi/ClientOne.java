package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientOne {

	public static void main(String[] args) {
		//System.out.println("Starting Client One...................");
		
		//System.out.println("Creating An Instance Of IoC Container.......");
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Emp emp=context.getBean("emp",Emp.class);
		System.out.println(emp);
		
		
		/*
		System.out.println("Asking For Emp Bean......");
		Emp emp=context.getBean("emp",Emp.class);
		
		System.out.println("Asking For Customer Bean....");
		Customer customer=context.getBean("customer",Customer.class);
		
		System.out.println("Asking For One More Emp Bean....");
		context.getBean("emp",Emp.class);
	
		System.out.println("Asking For One MOre Customer Instance......");
		context.getBean("customer",Customer.class);
		
		System.out.println("Ending Client One.....................");
		*/
		
	}

}
