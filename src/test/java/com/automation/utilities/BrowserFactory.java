package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	@SuppressWarnings("deprecation")
	public static WebDriver startApplication(WebDriver driver1,String browserName,String appUrl) {
	if(browserName.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver1=new ChromeDriver();
		
	}
	else if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
		driver1=new FirefoxDriver();
	}
	else  
	{
		System.out.println("we do not support this browser");
	}
	
	
	driver1.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	
	driver1.get(appUrl);

	driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	driver1.manage().window().maximize();
	
	driver1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	return driver1;
	}
	
	public static void quitBrowser(WebDriver driver1) {
	
	driver1.quit();
	}
	
	
	
	
	
	
	
	}
