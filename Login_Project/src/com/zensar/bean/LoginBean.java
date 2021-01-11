package com.zensar.bean;

public class LoginBean {

	private int userid;
	private String password;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginBean [userid=" + userid + ", password=" + password + "]";
	}
	public LoginBean(int userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}
	
	
}
