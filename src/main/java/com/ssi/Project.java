package com.ssi;

public class Project {
	private String pcode;
	private String title;
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Project [pcode=" + pcode + ", title=" + title + "]";
	}
	
	
}
