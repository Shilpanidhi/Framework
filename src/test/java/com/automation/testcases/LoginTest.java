package com.automation.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.pages.BaseClass;
import com.automation.pages.LoginPages;
import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ExcelDataProvider;

public class LoginTest extends BaseClass {


@Test(priority=1)
public void loginApp() {
	
	logger=report.createTest("login to crm");

 
LoginPages login=PageFactory.initElements(driver,LoginPages.class);
logger.info("start application");

//login.PassingKeys(ss.getStringData("Sheet1", 0, 0),ss.getStringData("Sheet1",0,1));
login.PassingKeys(cd.getDataConfig("email"),ss.getStringData("Sheet1", 0, 1));
logger.pass("login success");
}

@Test(priority=2)
public void loginApps() {
	
	logger=report.createTest("logout to crm");						
	logger.fail("logout failed");
}
}
