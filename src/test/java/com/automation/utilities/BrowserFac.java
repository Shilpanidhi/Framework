package com.automation.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFac {
	
public static WebDriver startApplication(WebDriver driver2,String browserName,String appUrl) {
	
if(browserName.equals("chrome")) {
	
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	
	driver2=new ChromeDriver();
	}

else if (browserName.equals("firefox{")) {
System.setProperty("webdriver.gecho.driver","./Drivers/gechodriver.exe");
	
	driver2=new FirefoxDriver();
}

else {
	
	System.out.println("we do not support this browser");
	
}
driver2.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);

driver2.get(appUrl);

driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

driver2.manage().window().maximize();

driver2.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

return driver2;
}

public static void quitBrowser(WebDriver driver2) {

driver2.quit();
}



}





	

	