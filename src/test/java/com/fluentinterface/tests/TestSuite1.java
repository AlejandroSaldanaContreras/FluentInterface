package com.fluentinterface.tests;

import org.testng.annotations.Test;

import com.fluentinterface.home.HomePage;
import com.fluentinterface.login.LoginPage;
import com.fluentinterface.product.ProductPage;
import com.fluentinterface.review.ReviewPage;
import com.fluentinterface.search.SearchPage;
import com.fluentinterface.utilities.DriverFactory;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestSuite1 {
  WebDriver driver = DriverFactory.getDriver();
  HomePage home = HomePage.getHomePage();
  SearchPage search = SearchPage.getSearchPage();
  LoginPage login = LoginPage.getLoginPage();
  ProductPage product = ProductPage.getProductPage();
  ReviewPage review = ReviewPage.getReviewPage();
  
  @BeforeMethod(alwaysRun = true)
  public void beforeMethod() {
	  driver.get("https://demo.nopcommerce.com/");
	  driver.manage().window().maximize();
  }
  
  
  @Test(priority = 0, groups= {"cold_users"})
  public void TC_Digital_DownLoad_C_001() {
	  home.act().search("Visions");
	  search.verify()
	  	.verifySearchPage()
	  	.verifyEmptySearch()
	  	.verifyKeywordSearch("Visions")
	  	.verifyResultVisions();
  }
  
  @Test(priority = 1, groups= {"hot_users"})
  public void TC_Digital_DownLoad_H_002() {
	  home.act().clickLogIn();
	  login.act().login("alexsald1398@gmail.com", "Alex1394");
	  home.act().search("Visions");
	  search.verify()
	  	.verifySearchPage()
	  	.verifyEmptySearch()
	  	.verifyKeywordSearch("Visions")
	  	.verifyResultVisions();
  }
   
  @Test(priority = 2, groups= {"cold_users"})
  public void TC_Digital_DownLoad_C_003() {
	  home.act().clickDigitalDownloadsOption();
	  home.verify().verifyCategory("Digital downloads")
	  	.verifyResults();
  }
  
  
  @Test(priority = 3, groups= {"hot_users"})
  public void TC_Digital_DownLoad_H_004() {
	  home.act().clickLogIn();
	  login.act().login("alexsald1398@gmail.com", "Alex1394");
	  home.act().clickDigitalDownloadsOption();
	  home.verify().verifyCategory("Digital downloads")
	  				.verifyResults();
  }
  
  
  @Test(priority = 4, groups= {"cold_users"})
  public void TC_Digital_DownLoad_C_Detail_005() {
	  home.act().search("Visions");
	  search.act().clickResult();
	  product.verify().verifyProductElements();
  }
  

 
  @Test(priority = 5, groups= {"hot_users"})
  public void TC_Digital_DownLoad_H_Detail_006() throws InterruptedException {
	  home.act().clickLogIn();
	  Thread.sleep(5000);
	  login.act().login("alexsald1398@gmail.com", "Alex1394");
	  home.act().search("Visions");
	  search.act().clickResult();
	  product.verify().verifyProductElements();
  }
  
  
  @Test(priority = 6, groups= {"cold_users"})
  public void TC_Digital_DownLoad_C_Product_Review_007() throws InterruptedException {
	  home.act().search("Visions");
	  Thread.sleep(5000);
	  search.act().clickResult();
	  product.act().clickReviews();
	  review.act().clickSubmitReview();
	  review.verify().verifyReviewColdUser("#e4434b");
  }
  

  @Test(priority = 7, groups= {"hot_users"})
  public void TC_Digital_DownLoad_H_Product_Review_008() throws InterruptedException {
	  home.act().clickLogIn();
	  Thread.sleep(5000);
	  login.act().login("alexsald1398@gmail.com", "Alex1394");
	  home.act().search("Visions");
	  search.act().clickResult();
	  product.act().clickReviews();
	  review.act().sendReview("Great CD", "This album is great", "4");
	  review.verify().verifyReviewHotUser();
  }

  
  @Test(priority = 8, groups= {"cold_users"})
  public void TC_Digital_DownLoad_C_Cloud_Tag_009() throws InterruptedException {
	  home.act().clickElectronicsOption()
	  			.scrollToTags()
	  			.clickViewAllTags()
	  			.clickDigitalTag();
	  home.verify().verifyTag("digital")
	  				.verifyResults();
  }
  
  
  @Test(priority = 9, groups= {"hot_users"})
  public void TC_Digital_DownLoad_h_Cloud_Tag_010() throws InterruptedException {
	  home.act().clickLogIn();
	  Thread.sleep(5000);
	  login.act().login("alexsald1398@gmail.com", "Alex1394");
	  
	  home.act().clickElectronicsOption()
	  			.scrollToTags()
	  			.clickDigitalTag();
	  
	  home.verify().verifyTag("digital")
					.verifyResults();
  }
  
}
