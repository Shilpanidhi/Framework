package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPaaaa {
	WebDriver driver;
	
public void Loginpaaa(WebDriver driver2) {
	
this.driver	=driver2;
	
}
@FindBy(name="email") WebElement Email;
@FindBy(name="pass") WebElement Password;
@FindBy(name="login") WebElement Login;

public void passingkeys(String Id,String pwd) {
	Email.sendKeys(Id);
	Password.sendKeys(pwd);
	Login.click();
}
}