import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DOBFacebbook {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(2000);
WebElement dateListbox=driver.findElement(By.id("day"));
Select s=new Select(dateListbox);
s.selectByValue("3");
Thread.sleep(2000);
WebElement monthListbox=driver.findElement(By.id("month"));
Select s1=new Select(monthListbox);
s1.selectByIndex(9);
Thread.sleep(2000);
WebElement yearListbox=driver.findElement(By.id("year"));
Select s2=new Select(yearListbox);
s2.selectByVisibleText("1990");

driver.quit();


	}

}
