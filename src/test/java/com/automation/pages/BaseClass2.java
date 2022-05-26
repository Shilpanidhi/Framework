package com.automation.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.automation.utilities.BrowserFac;
import com.automation.utilities.BrowserFactory;
import com.automation.utilities.ConfigDataProvider2;
import com.automation.utilities.ExcelDataProvidery2y;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass2 {
public WebDriver driver;
public  ExcelDataProvidery2y  cb;
public  ConfigDataProvider2  sv;
public ExtentReports report;
public ExtentTest loggers;

@BeforeSuite
 public void suitsetup() {
	 
	 
	 cb=new ExcelDataProvidery2y ();
	 sv=new  ConfigDataProvider2 ();
	ExtentSparkReporter  Extent= new ExtentSparkReporter (new File("./Reports/shree.html")); 
	report=new ExtentReports();
	report.attachReporter(Extent);
			 	 
 }
 @BeforeClass
 public void setup() {
	 
	 
		driver=BrowserFac.startApplication(driver,sv.getDataConfig("Browser"),cb.getStringData("Sheet1",1, 1));
 }
 
 @AfterClass
 public void teardown() {
		
	 BrowserFac.quitBrowser(driver);
	 
 }
 
 @AfterMethod
 public void teardownMethod()
 {
	 report.flush();
 }



}