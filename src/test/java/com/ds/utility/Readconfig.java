package com.ds.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfig {
	Properties pro;
	
	public Readconfig() 
	{
		File src = new File("C:\\SeleniumPractice\\OriginalFramework\\Configuration\\config.properties");
		try {
			FileInputStream fs = new FileInputStream("src");
			 pro= new Properties();
			pro.load(fs);
		} catch (FileNotFoundException e) {
			System.out.println("Exception is "+e.getMessage());
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
		
		public String getApplicationurl()
		{ 
		String url=pro.getProperty("baseurl");
		return url;
		}
		public String getusername()
		{
		String usr=pro.getProperty("username");	
		return usr;
		}
		public String getpassword()
		{
			String pwsd=pro.getProperty("password");
			return pwsd;
		}
		public String getchromepath()
		{
			String chp=pro.getProperty("chromepath");
			return chp;
		}
		public String getIEpath()
		{
			String iepath=pro.getProperty("iepath");
			return iepath;
		}
		public String getfirefoxpath()
		{
			String iepath=pro.getProperty("firefoxpath");
			return iepath;
		}



}
