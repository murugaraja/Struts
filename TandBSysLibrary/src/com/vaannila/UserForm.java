package com.vaannila;

import org.apache.struts.action.ActionForm;

public class UserForm extends org.apache.struts.action.ActionForm  {
	private String userName;
	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
