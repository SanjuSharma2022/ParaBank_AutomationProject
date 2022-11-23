package com.E_Bank_AutoProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.E_Bank_AutoProject.testcases.Baseclass;

public class CustomerCarepage {
WebDriver ldriver;
	
	
	public CustomerCarepage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(xpath="//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")
	WebElement contact;
	
	@FindBy(id="name")
	WebElement uname;
	
	@FindBy(id="email")
	@CacheLookup
	WebElement uemail;
	
	@FindBy(id="phone")
	@CacheLookup
	WebElement uphone;
	
	@FindBy(name="message")
	WebElement umsg;
	
	
	public void gopage() {
		contact.click();
	}
	public void name(String usrname)
	{
		uname.sendKeys(usrname);
	}
	public void email(String usremail)
	{
		uemail.sendKeys(usremail);
	}
	public void phone(String usrphone)
	{
		uphone.sendKeys(usrphone);;
	}
	public void msg(String usrmsg) {
		umsg.sendKeys(usrmsg);
	}
	


}
