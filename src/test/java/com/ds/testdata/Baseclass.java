package com.ds.testdata;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;

import com.ds.utility.Readconfig;

public class Baseclass {
	
	Readconfig rcfg = new Readconfig();
	
	public String baseurl = rcfg.getApplicationurl();
	public String username = rcfg.getusername();
	public String  pswd = rcfg.getpassword();
	
	public static WebDriver driver;
	@Parameters("browser")
	//@Beforeclass
	public void setup(String br)
	{
		if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", rcfg.getchromepath());
			driver = new ChromeDriver();
		}
		else if(br.equals("IEpath"))
		{
			System.setProperty("webdriver.gecko.driver",rcfg.getIEpath());
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",rcfg.getfirefoxpath());
			driver = new FirefoxDriver();
		}
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(baseurl);
	}
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	public void captureScreen(WebDriver driver, String tname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	}
	
	


