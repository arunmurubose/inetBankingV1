package com.inetbanking.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.reporter.ExtentReporter;
import com.inetbanking.utilities.ReadConfigurationFileData;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class BaseClass extends ReadConfigurationFileData{
	public String baseURL=ReadConfigurationFileData.readConfigFileDataUsingKey("baseURL");
	public String username=ReadConfigurationFileData.readConfigFileDataUsingKey("username");
	public String password="AqudyhU";
	public static WebDriver driver;
	public static Logger logger;
	
	ExtentReports extendReport;
	ExtentReporter htmlReporter;
	ExtentTest testCase;
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String browser)
	{
//		logger.getLogger(BaseClass.class);
//		PropertyConfigurator.configure("log4j.properties");
		extendReport=new ExtentReports();
		htmlReporter=new ExtentHtmlReporter("ExtentReport.html");
	
		
		

		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Drivers//IEDriverServer.exe");
			driver=new InternetExplorerDriver();	
		}
		driver.get(baseURL);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
}
