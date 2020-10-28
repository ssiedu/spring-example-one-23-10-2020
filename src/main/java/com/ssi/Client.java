package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Client {

	public static void main(String[] args) {

		//we will obtain an instance using spring-container.
		
		//step-1 (instantiating container)
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context=new FileSystemXmlApplicationContext("e:/conf/info.xml");
		//step-2 (ask container to provide a bean instance)
		//Account account=(Account)context.getBean("ac1");
		Account account1=context.getBean("account",Account.class);
		Account account2=context.getBean("account",Account.class);
		//System.out.println(account1==account2);
		System.out.println(account1);
		System.out.println(account2);
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
