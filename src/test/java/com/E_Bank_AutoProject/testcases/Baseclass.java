package com.E_Bank_AutoProject.testcases;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.E_Bank_AutoProject.utilities.ReadConfig;



public class Baseclass {
	
	ReadConfig readconfig = new ReadConfig();
	
	public String BaseURL =readconfig.getAppURL();
	public String username =readconfig.getUsername();
	public String password =readconfig.getpassword();
	public static WebDriver driver;
	//public String navURL = readconfig.getNavURL();
	
	public static Logger logger;
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		logger= Logger.getLogger("ebanking");
		PropertyConfigurator.configure("log4j.properties");
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver",readconfig.getchrome());
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		}
		else if (br.equals("gecko")) {
			System.setProperty("webdriver.gecko.driver",readconfig.getgecko());
			driver = new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
			driver.manage().window().maximize();
			}
		driver.get(BaseURL);
		
	}
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	public void capturescreens(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts= (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		//File target = new File(System.getProperty("user.dir")+"/Screenshots/"+ tname + ".png");
		File target = new File(System.getProperty("user.dir")+"/Screenshots/TestcasesScreens"+ tname + ".png");
		//FileHandler.copy(source, new File(System.getProperty("user.dir")+ "\\Screenshots\\alertfail.png"));
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot captured");
		
	}

}
