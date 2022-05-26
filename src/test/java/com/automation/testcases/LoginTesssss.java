package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.LoginPaaaa;
import com.automation.utilities.BrowserFactory;

public class LoginTesssss {
	
	WebDriver driver;
	
	
	@BeforeClass
	public void setup() {
	
		driver	=BrowserFactory.startApplication(driver, "chrome","https://www.facebook.com/");
		
		String	title=driver.getTitle();
		System.out.println(title);
		
	}
	
	@Test

	public void loginApps() {
		
	LoginPaaaa loginpin=PageFactory.initElements(driver, LoginPaaaa.class);
	loginpin.passingkeys("9663858958","umavijay");
	
	}
	
	
	@AfterClass
	public void teardown() {
		
		BrowserFactory.quitBrowser(driver);
		
	}
}
	
