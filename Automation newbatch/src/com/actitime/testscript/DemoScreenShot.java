package com.actitime.testscript;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScreenShot {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
Takescreenshot t=(TakesScreenshot)driver;
File src=t.getscreenshotsAs(OutputType.FILE);
File dest=new File

	}

}
