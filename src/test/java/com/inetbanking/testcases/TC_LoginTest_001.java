package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import com.aventstack.extentreports.util.Assert;
import com.inetbanking.pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	// com.inetbanking.testcases.TC_LoginTest_001
	
	@Test
	public void loginTest() throws InterruptedException
	{
//		logger.getLogger(TC_LoginTest_001.class);
//		PropertyConfigurator.configure("log4j.properties");

		driver.get(baseURL);
//		logger.info("sdffds");


		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		lp.setUserName(username);
//		logger.info("Username entered successfully");

		lp.setPassword(password);
//		logger.info("password entered successfully");
		Thread.sleep(5000);

		lp.clickLoginButton();
		if(driver.getTitle().equals("GTPL Bank Manager HomePage"))
		{
			org.testng.Assert.assertTrue(true);
//			logger.info("Login test passed");

		}
		else
		{
			org.testng.Assert.assertTrue(false);
//			logger.info("Login test failed");

		}
	}
}
