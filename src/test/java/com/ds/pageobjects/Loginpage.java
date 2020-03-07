package com.ds.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver idriver;
	
	public Loginpage(WebDriver rdriver)
	{
		idriver=rdriver;
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement txtsubmit;
	


public void setusername(String uname)
{
	txtusername.sendKeys(uname);
}
public void setpassword(String upswd)
{
	txtusername.sendKeys(upswd);
}
public void submit()
{
	txtsubmit.click();
}
	
}
