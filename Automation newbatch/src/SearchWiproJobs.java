import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWiproJobs {

	public static void main(String[] args) throws AWTException, InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.findElement(By.id("APjFqb")).sendKeys("wipro jobs");
Thread.sleep(2000);
Robot r=new Robot();
r.keyPress((KeyEvent.VK_ENTER));
r.keyRelease((KeyEvent.VK_ENTER));
Thread.sleep(2000);
 List<WebElement>links=driver.findElements(By.xpath("//h3"));
 Thread.sleep(2000);
 int count=links.size();
 System.out.println(count);
 for(int i=0;i<count;i++)
 {
	String text=links.get(i).getText();
	System.out.println(text);
	String url=links.get(i).getAttribute("h3");
	System.out.println(url);
	 
 }






	}
}
