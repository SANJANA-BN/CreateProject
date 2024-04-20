package com.actitime.generic;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Reporter;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeTest;

	public class BaseClass {
		public static WebDriver driver;
		@BeforeTest
		public void openbrowser()
		
		{
			Reporter.log("openbrowser",true);
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
		}
		@AfterTest
		public void closebrowser()
		{
			Reporter.log("closebrowser",true);
			driver.close();
		}
		@BeforeMethod
		public void login()throws IOException
		{
			Reporter.log("login",true);
			FileLib f=new FileLib();
			String url=f.getpropertyData("url");
			String un=f.getpropertyData("username");
			String pw=f.getpropertyData("password");
			driver.get(url);
			
		}

	}

