import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EnterPolicyNO {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
driver.findElement(By.id("policynumber")).sendKeys("123");
Thread.sleep(2000);
driver.findElement(By.id("dob")).click();
driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
Select s=new Select(month);
s.selectByIndex(9);
Thread.sleep(2000);
driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
Select s1=new Select(year);
s1.selectByValue("1990");
Thread.sleep(2000);
driver.findElement(By.xpath("//a[@data-date='3']")).click();
driver.findElement(By.id("alternative_number")).sendKeys("9845098450");
driver.findElement(By.id("renew_policy_submit")).click();
boolean displayed=driver.findElement(By.id("policynumberError")).isDisplayed();
if(displayed==true) {
	System.out.println("true");
}
else {
	System.out.println("false");
	
	}
	}

	}


