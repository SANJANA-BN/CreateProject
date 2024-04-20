import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scroll3000 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.bbc.com/");
Thread.sleep(2000);
driver.findElement(By.id("close")).click();
Thread.sleep(2000);
Actions a=new Actions(driver);
a.scrollByAmount(0, 3000).perform();

	}

}
