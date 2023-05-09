package com.fluentinterface.utilities;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.Assert;


public class CommonVerifier {
	WebDriver driver = DriverFactory.getDriver();
	
	CommonVerifier(){
		
	}
	
	public static CommonVerifier getCommonVerifier() {
		return new CommonVerifier();
	}

	public CommonVerifier isDisplayed(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
		return this;
	}
	
	public CommonVerifier isEmpty(WebElement element) {
		Assert.assertEquals(element.getAttribute("value"), "");
		return this;
	}
	
	public CommonVerifier areEquals(String element, String value) {
		Assert.assertEquals(element, value);
		return this;
	}
	
	public CommonVerifier areEquals(Color color1, Color color2) {
		Assert.assertEquals(color1, color2);
		return this;
	}
	
	public CommonVerifier isNotEnabled(WebElement element) {
		Assert.assertFalse(element.isEnabled());
		return this;
	}
}
