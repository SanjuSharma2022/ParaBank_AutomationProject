package com.E_Bank_AutoProject.testcases;

import org.testng.annotations.Test;

import com.E_Bank_AutoProject.pageobjects.Loginpage;
import com.E_Bank_AutoProject.pageobjects.ReqLoanpage;

public class TC_requestloan_005 extends Baseclass{
	@Test
	public void requestloan() throws InterruptedException {
		Loginpage lp = new Loginpage(driver);
		
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		lp.img();
		Thread.sleep(2000);
		
		ReqLoanpage RL = new ReqLoanpage(driver);
		
		RL.reqloanpage();
		RL.amt();
		RL.dpayment();
		Thread.sleep(2000);
		driver.navigate().refresh();
		RL.facc();
		RL.amt();
		RL.dpayment();
		RL.facc();
		RL.appnow();
	}

}
