import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertWithOkCancelButton {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
Thread.sleep(2000);
driver.get("https://demo.automationtesting.in/Alerts.html");
Thread.sleep(2000);
driver.findElement(By.linkText("Alert with OK & Cancel")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Thread.sleep(2000);
Alert a=driver.switchTo().alert();
String text=a.getText();
System.out.println(text);
a.dismiss();

Thread.sleep(2000);
boolean msg=driver.findElement(By.id("demo")).isDisplayed();
Thread.sleep(2000);

if(msg==true) {
	System.out.println(true);}
	else {
		System.out.println(false);
}
















	}
}
