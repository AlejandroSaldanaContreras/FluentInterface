package com.fluentinterface.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.fluentinterface.utilities.DriverFactory;

public class LoginPageActController {
	WebDriver driver = DriverFactory.getDriver();
	
	public LoginPageActController login(String user, String password) {
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(user);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.className("login-button")).click();
		return this;
	}

}
