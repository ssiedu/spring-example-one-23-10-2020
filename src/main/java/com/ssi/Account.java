package com.ssi;

public class Account {
	
	private int code;
	private String name;
	private int balance;
	private Branch branch;
	
	
	public Account() {
		System.out.println("Account Instance Created...");
	}
	public Branch getBranch() {
		return branch;
	}
	public void setBranch(Branch branch) {
		this.branch = branch;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [code=" + code + ", name=" + name + ", balance=" + balance + ", branch=" + branch + "]";
	}
	
	
}
