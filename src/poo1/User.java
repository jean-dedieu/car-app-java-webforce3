package poo1;

import java.util.Scanner;

public class User {

	private String name;
	private String mailAdress;
	private String password;

	// constructor
	public User(String name, String mailAdress, String password) {
		this.name = name;
		this.mailAdress = mailAdress;
		this.password = password;

	}
	// setters and getters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public String getMailAdress() {
		return mailAdress;
	}

	public void setMailAdress(String mailAdress) {
		this.mailAdress = mailAdress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}