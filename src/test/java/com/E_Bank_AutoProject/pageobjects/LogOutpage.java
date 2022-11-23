package com.E_Bank_AutoProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutpage {
WebDriver ldriver;
	
	public LogOutpage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(linkText="Log Out")
	WebElement lgout;
	

public void lgout() {
	lgout.click();
	
}
}
