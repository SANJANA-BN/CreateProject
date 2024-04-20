import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollPerticularElement {

public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
Thread.sleep(2000);
driver.findElement(By.id("close")).click();
Thread.sleep(2000);
WebElement travel=driver.findElement(By.xpath(("//h2[text()='Travel'])[1]")));
Actions a=new Actions(driver);
a.scrollToElement(travel).perform();


	}

}
