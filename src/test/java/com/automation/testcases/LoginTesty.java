package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass2;
import com.automation.pages.LoginPagesty;
import com.automation.utilities.BrowserFac;
import com.automation.utilities.BrowserFactory;

public class LoginTesty  extends BaseClass2

{



@Test(priority=1)
	public void loginApp()
	{
	

	loggers=report.createTest("login to crm");

	LoginPagesty loginpins= PageFactory.initElements(driver, LoginPagesty.class);
	loggers.info("start application");
	
	loginpins.PassingKeys(sv.getDataConfig("email"),cb.getStringData("Sheet1", 0, 1));
		loggers.pass("login success");
	
	
	}

@Test(priority=2)
public void loginApps() {
	
	loggers=report.createTest("logout to crm");
	loggers.fail("logout failed");

}
}
	
	


