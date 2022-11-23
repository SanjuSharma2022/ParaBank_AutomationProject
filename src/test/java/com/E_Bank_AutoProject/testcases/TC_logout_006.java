package com.E_Bank_AutoProject.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.E_Bank_AutoProject.pageobjects.LogOutpage;
import com.E_Bank_AutoProject.pageobjects.Loginpage;

public class TC_logout_006 extends Baseclass{
	@Test
	public void logout() throws InterruptedException, IOException {
Loginpage lp = new Loginpage(driver);
		
		lp.setusername(username);
		lp.setpassword(password);
		lp.clicksubmit();
		lp.img();
		Thread.sleep(2000);
		
		LogOutpage lo = new LogOutpage(driver);
		
		lo.lgout();
		
		capturescreens(driver, "logout");
		
		logger.info("Logged out successfully");
	}

}
