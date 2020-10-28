package com.ssi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Emp implements InitializingBean, DisposableBean {
	private int eno;
	private String ename;
	
	
	
	
	public void stop() {}
	
	public void afterPropertiesSet() throws Exception {
		// this method is implicitly called after all the properties of the bean have been set
		startTask();
	}
	
	public void startTask() {
		System.out.println("StartingTask After All Properties Set......");
	}
	
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
		System.out.println("Property eno is set........");
	}
	
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
		System.out.println("Property ename is set.........");
	}

	
	@Override
	public String toString() {
		return "Emp [eno=" + eno + ", ename=" + ename + "]";
	}

	public Emp() {
		System.out.println("Emp Bean Instantiated...........");
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}

	
}
