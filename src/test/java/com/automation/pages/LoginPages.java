package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {
	
	WebDriver driver;
	
	
public void LoginPages(WebDriver driver1){
	
	this.driver=driver1;
	
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
