package com.E_Bank_AutoProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class TransferFundspage {
	WebDriver ldriver;
	
	public TransferFundspage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Transfer Funds")
	WebElement Transferfunds;
	
	@FindBy(id="amount")
	WebElement amount;
	
	@FindBy(xpath="//*[@id=\"fromAccountId\"]")
	WebElement fromacc;
	
	@FindBy(xpath="//*[@id=\"toAccountId\"]")
	WebElement toacc;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div/form/div[2]/input")
	WebElement transfer;
	
	@FindBy(id="amount")
	WebElement trnsamnt;
	
	public void transferfunds() {
		Transferfunds.click();
	}
	public void amount() {
		amount.sendKeys("10000");
	}
	public void fromacc() {
		fromacc.click();
		Select select1 = new Select(fromacc);
		//select1.selectByVisibleText("12456");
		select1.selectByValue("12345");
		
	}
	public void toacc() {
		toacc.click();
		Select select1 = new Select(toacc);
		select1.selectByValue("12456");
		
	}
	public void transfer() {
		transfer.click();
	}
	public void trnsamnt() {
		trnsamnt.isDisplayed();
	}
	
}
