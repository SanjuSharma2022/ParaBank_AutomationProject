package com.E_Bank_AutoProject.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Billpaypage {
WebDriver ldriver;

public Billpaypage(WebDriver rdriver) {
	ldriver= rdriver;
	PageFactory.initElements(rdriver, this);
	}

@FindBy(linkText="Bill Pay")
@CacheLookup
WebElement page;


@FindBy(how=How.NAME, using="payee.name")
@CacheLookup
WebElement payeename;
@FindBy(how=How.NAME, using="payee.address.street")
@CacheLookup
WebElement address;
@FindBy(how=How.NAME, using="payee.address.city")
@CacheLookup
WebElement city;
@FindBy(how=How.NAME, using="payee.address.state")
@CacheLookup
WebElement state;
@FindBy(how=How.NAME, using="payee.address.zipCode")
@CacheLookup
WebElement zipcode;
@FindBy(how=How.NAME, using="payee.phoneNumber")
@CacheLookup
WebElement phnumber;
@FindBy(how=How.NAME, using="payee.accountNumber")
@CacheLookup
WebElement accnumber;
@FindBy(how=How.NAME, using="verifyAccount")
@CacheLookup
WebElement vfacc;
@FindBy(how=How.NAME, using="amount")
@CacheLookup
WebElement amount;
@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[13]/td[2]/select")
@CacheLookup
WebElement FromAcc;
@FindBy(xpath="//*[@id=\"rightPanel\"]/div/div[1]/form/table/tbody/tr[14]/td[2]/input")
@CacheLookup
WebElement submit;

public void page() {
	page.click();
}
public void payeename(String name) {
	payeename.sendKeys(name);
}
public void address(String add) {
	address.sendKeys(add);
}
public void city(String ct) {
	city.sendKeys(ct);
}
public void state(String st) {
	state.sendKeys(String.valueOf(st));
}
public void zipcode(String zp) {
	zipcode.sendKeys(String.valueOf(zp));
}
public void phnumber(String phn) {
	phnumber.sendKeys(String.valueOf(phn));
}
public void accnumber(String accnum) {
	accnumber.sendKeys(String.valueOf(accnum));
}
public void vfacc(String vfc) {
	vfacc.sendKeys(vfc);
}
public void amn(String amnt) {
	amount.sendKeys(String.valueOf(amnt));
}
public void FromAcc() {
	System.out.println(FromAcc.isDisplayed());
}
public void submit() {
	submit.click();
}
}
