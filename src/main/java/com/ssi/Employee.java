package com.ssi;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private int eno;
	private String ename;
	//private List<String> mobiles;
	private Set<String> mobiles;
	private Map<String,String> emails;
	private Properties addresses;
	private List<Project> projects;
	
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Map<String, String> getEmails() {
		return emails;
	}
	public void setEmails(Map<String, String> emails) {
		this.emails = emails;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
	public Properties getAddresses() {
		return addresses;
	}
	public void setAddresses(Properties addresses) {
		this.addresses = addresses;
	}
	public Set<String> getMobiles() {
		return mobiles;
	}
	public void setMobiles(Set<String> mobiles) {
		this.mobiles = mobiles;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", projects=" + projects + "]";
	}
	
	
	
}
