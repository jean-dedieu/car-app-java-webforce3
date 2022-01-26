package com.webforce3.poo;

public class User {
	private String name;
	private String phoneNumber;
	private String email;
	private String passWord;
	
	public User(String name,String phoneNumber, String email, String passWord) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.passWord = passWord;
		
	}
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public String phoneNumber() {
		return phoneNumber;
	}
	
	public void phoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;	
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;	
	}
	
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;	
	}

}
