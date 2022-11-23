package com.E_Bank_AutoProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver ldriver;
	
	public Loginpage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(name="username")//
	WebElement txtusername;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[2]/input")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath="//*[@id=\"topPanel\"]/a[2]/img")
	WebElement img;
	
	
	
	public void setusername(String username)
	{
		txtusername.sendKeys(username);
	}
	public void setpassword(String password)
	{
		txtpassword.sendKeys(password);
	}
	public void clicksubmit()
	{
		Login.click();
	}
	public void img() {
		System.out.println(img.isDisplayed());
	}
	


}
