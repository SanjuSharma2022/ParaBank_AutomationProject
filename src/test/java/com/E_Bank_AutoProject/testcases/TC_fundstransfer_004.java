package com.E_Bank_AutoProject.testcases;

import java.io.IOException;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.E_Bank_AutoProject.pageobjects.Loginpage;
import com.E_Bank_AutoProject.pageobjects.TransferFundspage;

public class TC_fundstransfer_004 extends Baseclass
{
	@Test
	public void fundtransfer() throws InterruptedException, IOException {
	Loginpage lp = new Loginpage(driver);
	
	lp.setusername(username);
	lp.setpassword(password);
	lp.clicksubmit();
	lp.img();
	Thread.sleep(2000);
	
	TransferFundspage tf = new TransferFundspage(driver);
	
	tf.transferfunds();
	tf.amount();
	Thread.sleep(1000);
	driver.navigate().refresh();
	tf.fromacc();
	tf.toacc();
	tf.amount();
	tf.transfer();
	Thread.sleep(30000);
	
	tf.trnsamnt();

	Thread.sleep(2000);
	capturescreens(driver, "fundtransfer");
	}
}
