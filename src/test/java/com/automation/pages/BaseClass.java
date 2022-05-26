package com.automation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider;
import com.automation.utilities.ExcelDataProvider;
import com.automation.utilities.Helper;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {
	
public WebDriver driver;
public ExcelDataProvider ss;
public ConfigDataProvider cd;
public ExtentReports report;
public ExtentTest logger;

@BeforeSuite
public void SuitSetup()
{

 ss=new ExcelDataProvider();
	cd=new ConfigDataProvider();
	
	ExtentSparkReporter extent=new ExtentSparkReporter(new File("./Reports/"+Helper.getCurrentDateTime()+"_ExtentReport.Html"));
	report=new ExtentReports();
	report.attachReporter(extent);
	
}

	
	@BeforeClass
	public void setup() {
		
		//driver=BrowserFactory.startApplication(driver,cd.getBrowser(),cd.getDataConfig("qaUrl"));	
		driver=BrowserFactory.startApplication(driver,cd.getDataConfig("Browser") , ss.getStringData("Sheet1",1, 1));
		
		
		
	}

	@AfterClass
	public void teardown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
  public void tearDownMethod(ITestResult result) {
	  
	  
	  if(result.getStatus()==ITestResult.FAILURE) {
		  
		 
	logger.fail("Test failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		  
		   }
	  else if(result.getStatus()==ITestResult.SUCCESS) {
		  
			 
	logger.pass("Test passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
				  
				   }
	  
	  else if(result.getStatus()==ITestResult.SKIP)
			  {
		  logger.skip("Test skipped", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		  
		  
			  }
	  
	  report.flush();
	  
			 
  }
	
	

}
	