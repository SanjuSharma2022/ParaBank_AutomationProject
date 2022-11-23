package com.E_Bank_AutoProject.testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.E_Bank_AutoProject.pageobjects.Loginpage;

import junit.framework.Assert;


public class TC_logintest_001 extends Baseclass{
		@Test
		public void logintest() throws IOException
		{
			
			logger.info("URL is opened");
			
			Loginpage lp = new Loginpage(driver);
			
			lp.setusername(username);
			logger.info("Provided Username");
			
			lp.setpassword(password);
			logger.info("Provided Password");
			lp.clicksubmit();
			logger.info("logged in");
			
			lp.img();
			logger.info("image checked");
			
			if(driver.getTitle().equals("ParaBank | Accounts Overview"))
			{
				Assert.assertTrue(true);
				System.out.println("Title matched");
			}
			else 
			{
				capturescreens(driver, "logintest");
				System.out.println("Title didn't match");
				Assert.assertTrue(false);
				
				}

	}
}



