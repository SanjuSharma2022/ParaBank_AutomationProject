package com.E_Bank_AutoProject.testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.E_Bank_AutoProject.pageobjects.CustomerCarepage;
import com.E_Bank_AutoProject.utilities.XLutility;


public class TC_custCare_003 extends Baseclass
{
	@Test(dataProvider="LoginData")
	public void custoperations(String usrname, String usremail, String usrphone, String usrmsg) throws InterruptedException
	{ 
		 CustomerCarepage custcare = new CustomerCarepage(driver);
		 custcare.gopage();
		 Thread.sleep(2000);
		 	custcare.name(usrname);
		 	custcare.email(usremail);
		 	custcare.phone(usrphone);
		 	custcare.msg(usrmsg);
		 
		 }
	
	@DataProvider(name="LoginData")
	String [][] getData() throws IOException
	{
		String path = System.getProperty("user.dir")+"/resources/Data_ParaBank.xlsx";
		int rownum = XLutility.getRowCount(path, "Sheet1");
		int Colcount = XLutility.getCellCount(path, "Sheet1", 1);
		String [][] logindata = new String [rownum][Colcount];
		for(int i=1; i<=rownum;i++) {
			for(int j=0; j<Colcount; j++) {
				logindata[i-1][j]=XLutility.getCellData(path, "Sheet1", i, j);
					
			}
			
		}
		
		return logindata;
	}
	
	}


