package com.fluentinterface.login;

public class LoginPage {
	private LoginPageActController act;
	private LoginPageVerifyController verify;
	
	private LoginPage(LoginPageActController _act, LoginPageVerifyController _verify) {
		this.act = _act;
		this.verify = _verify;
	}
	
	public LoginPageActController act() {
		return act;
	}
	
	public LoginPageVerifyController verify() {
		return verify;
	}
	
	public static LoginPage getLoginPage() {
		return new LoginPage(new LoginPageActController(), new LoginPageVerifyController());
	}
}
