import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverResource {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.vtiger.com/");
	WebElement resources=driver.findElement(By.partialLinkText("Resources"));
	Actions a=new Actions(driver);
	a.moveToElement(resources).perform();
	driver.findElement(By.partialLinkText("Customers")).click();
	 WebElement loginpage=driver.findElement(By.id("loginspan"));
	 Actions a1=new Actions(driver);
	 a1.doubleClick(loginpage).perform();	
	  String title=driver.getTitle();
	  System.out.println(title);
	  if(driver.getTitle().contains(title))
	  {
		  System.out.println("loginpage is displayed");}
		  else
		  {
			  System.out.println("login page is not displayed");
	  }
	  
	  }
	 
	}



	 
	 
	 
	


