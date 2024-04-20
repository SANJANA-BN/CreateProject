import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingTabAutomateScenario {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
driver.findElement(By.id("username")).sendKeys("admin");
driver.findElement(By.name("pwd")).sendKeys("manager");
driver.findElement(By.id("loginButton")).click();
driver.findElement(By.xpath("//div[contains(text()='Help']")).click();
driver.findElement(By.xpath("//a[contains(text()='About your actiTIME']")).click();

driver.findElement(By.linkText("About your actiTIME")).click();
driver.findElement(By.linkText("Read License Agreement")).click();
List<WebElement> tagname=driver.findElements(By.tagName("//h2"));
int count=tagname.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	String text=tagname.get(i).getText();
	System.out.println(text);
	driver.close();
}
String pwh=driver.getWindowHandle();
Set<String>allwh=driver.getWindowHandles();
for(String wh:allwh)
{
	driver.switchTo().window(wh);
	if(pwh.equals(allwh))
	{
		driver.close();
	}
}
	}
}
	





	
	
	

