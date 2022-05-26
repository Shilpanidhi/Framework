package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPagesty {
	
	WebDriver driver;
	
	
public void LoginPages(WebDriver driver2){
	
	this.driver=driver2;
	
}	
	
	@FindBy(name="email") WebElement Email;
	@FindBy(name="pass") WebElement password;
	@FindBy(name="login") WebElement Login;
	
	public void PassingKeys(String Id,String pwd) {
		Email.sendKeys(Id);
		password.sendKeys(pwd);
		Login.click();
	}
	

}



