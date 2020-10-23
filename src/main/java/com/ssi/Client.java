package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		//we will obtain an instance using spring-container.
		
		//step-1 (instantiating container)
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		
		//step-2 (ask container to provide a bean instance)
		Account account=(Account)context.getBean("ac1");
		System.out.println(account);
		
		/*
		// we are creating and managing bean instance ourself
		 
		Account account=new Account();
		account.setCode(1001);
		account.setName("ABCD");
		account.setBalance(50000);
		System.out.println(account);
		*/
	}

}
