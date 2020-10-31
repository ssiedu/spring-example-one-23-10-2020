package com.ssi;

public class Customer {
	private int code;
	private String name;
	private Address address;
	private String ctype;
	private int creditLimit;
	
	public Customer() {
		//System.out.println("Customer Zero Arg Constructor .........");
	}
	
	public Customer(double code, String name) {
		//System.out.println("Two Args Constructor(double,String)........");
	}
	public Customer(int code, String name) {
		//System.out.println("Two Args Constructor(int,String)........");
		this.code = code;
		this.name = name;
	}
	
	public Customer(int code, String name, Address address) {
	//	System.out.println("Three Args Constructor........");
		this.code = code;
		this.name = name;
		this.address = address;
	}

	
	
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		//System.out.println("Setting Code...");
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		//System.out.println("Setting Name...");
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		//System.out.println("Setting Address...");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [code=" + code + ", name=" + name + ", address=" + address + "]";
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(int creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	
}
