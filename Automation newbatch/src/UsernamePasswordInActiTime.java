import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernamePasswordInActiTime {
	public static void main(String[]args)
	{
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
WebElement input=driver.findElement(By.name("username"));
input.sendKeys("admin");
WebElement input1=driver.findElement(By.name("pwd"));
input1.sendKeys("manager");
WebElement ele=driver.findElement(By.id("loginButton"));
//driver.quit();
	}




}
