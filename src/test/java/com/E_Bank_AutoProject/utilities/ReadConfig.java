package com.E_Bank_AutoProject.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebElement;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() {
		File src = new File("./Configuration/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e){
			System.out.println("Exception is : "+e.getMessage());
			
		}
	}
	public String getAppURL() {
		String url = pro.getProperty("BaseURL");
		return url;
	}
	public String getUsername() {
		String username = pro.getProperty("username");
		return username;
	}
	public String getpassword() {
		String password = pro.getProperty("password");
		return password;
	}
//	public String getNavURL() {
//		String nav = pro.getProperty("navURL");
//		return nav;
//	}
	public String getchrome() {
		String chrome = pro.getProperty("chromepath");
		return chrome;
	}
	public String getgecko() {
		String chrome = pro.getProperty("geckopath");
		return chrome;
	}
	
	

}
