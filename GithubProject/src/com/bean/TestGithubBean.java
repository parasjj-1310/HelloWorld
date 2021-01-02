package com.bean;

public class TestGithubBean {

	public String fname;
	public String lname;
	public int sid;
	
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Override
	public String toString() {
		return "TestGithubBean [fname=" + fname + ", lname=" + lname + ", sid=" + sid + "]";
	}
	
}
