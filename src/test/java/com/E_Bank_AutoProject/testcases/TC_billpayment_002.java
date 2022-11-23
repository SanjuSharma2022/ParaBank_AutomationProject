package com.E_Bank_AutoProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.E_Bank_AutoProject.pageobjects.Billpaypage;
import com.E_Bank_AutoProject.pageobjects.Loginpage;

import junit.framework.Assert;

public class TC_billpayment_002 extends Baseclass
{

 @Test	
 public void Billpay() throws InterruptedException, IOException {
	 Loginpage lp = new Loginpage(driver);
	 lp.setusername(username);
	 lp.setpassword(password);
	 lp.clicksubmit();
	 
	 Thread.sleep(2000);
	 
	 Billpaypage bpay = new Billpaypage(driver);
	 bpay.page();
	 bpay.payeename("QALA");
	 bpay.address("CKRoad , Austria");
	 bpay.city("Melbourne");
	 bpay.state("Ahice");
	 bpay.zipcode("001110");
	 Thread.sleep(2000);
	 bpay.phnumber("12213344");
	 bpay.accnumber("1456709");
	 bpay.vfacc("1456709");
	 bpay.amn("10000");
	 bpay.FromAcc();
	 bpay.submit();
	 logger.info("Informations feeded");
	 
	 
	 boolean payment = driver.getPageSource().contains("Bill Payment Complete");
	 if(payment==true) {
		 Assert.assertTrue(true);
	 }
	 else {
		 capturescreens(driver,"Billpay");
		 Assert.assertTrue(false);
	 }
	 logger.info("Testcase passed");
	 
 }
}
