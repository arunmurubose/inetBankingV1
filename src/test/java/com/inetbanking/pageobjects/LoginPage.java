package com.inetbanking.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(rdriver, this);

	}
	@FindBy(how = How.NAME,using = "uid")
	@CacheLookup
	WebElement userName;

	@FindBy(how = How.NAME,using = "password")
	@CacheLookup
	WebElement password;

	@FindBy(how = How.NAME,using = "btnLogin")
	@CacheLookup
	WebElement loginButton;

	public void setUserName(String uname)
	{
		userName.sendKeys(uname);
	}

	public void setPassword(String pword)
	{
		password.sendKeys(pword);
	}

	public void clickLoginButton()
	{
		loginButton.click();
	}








}
