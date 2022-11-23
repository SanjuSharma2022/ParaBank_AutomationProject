package com.E_Bank_AutoProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ReqLoanpage {
WebDriver ldriver;
	
	public ReqLoanpage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(linkText="Request Loan")
	WebElement reqloanpage;
	
	@FindBy(id="amount")
	WebElement amt;
	
	@FindBy(id="downPayment")
	WebElement dpayment;
	
	@FindBy(xpath="//*[@id=\"fromAccountId\"]")
	WebElement facc;
	
	@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")
	WebElement appnow;
	
	public void reqloanpage() {
		reqloanpage.click();
	}
	public void amt() {
		amt.sendKeys("100000");
	}
	public void dpayment() {
		dpayment.sendKeys("10000");
	}
	public void facc() {
		facc.click();
		Select selectfacc = new Select(facc);
		selectfacc.selectByIndex(0);;
	}
	public void appnow(){
		appnow.click();
	}
	
	
	
	
	

}
