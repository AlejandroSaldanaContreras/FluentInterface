package com.fluentinterface.home;

public class HomePage {
	private HomePageActController act; 
	private HomePageVerifyController verify; 
	
	private HomePage(HomePageActController _act, HomePageVerifyController _verify) {
		this.act = _act;
		this.verify = _verify;
	}
	
	public HomePageActController act() {
		return act;
	}
	
	public HomePageVerifyController verify() {
		return verify;
	}
	
	public static HomePage getHomePage() {
		return new HomePage(new HomePageActController(), new HomePageVerifyController());
	}
}
