package com.ds.testdata

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ds.pageobjects.Loginpage;

public class TC_logincase extends Baseclass {
	@Test
	public void logintest()
	{
		Loginpage lp =  new Loginpage(driver);
		lp.setusername(username);
		lp.setpassword(pswd);
		lp.submit();
	}

	

}
