package com.qlbh.bean;

public class Users {
	
	private String userName;
	private String passWord;
	private String fullName;
	private String phone;
	private String rePass;
	public Users(){
		
	}

	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getPassWord() {
		return passWord;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}	
	public String getUserName() {
		return userName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getFullName() {
		return fullName;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setRePass(String rePass) {
		this.rePass = rePass;
	}
	public String getRePass() {
		return rePass;
	}	
}
