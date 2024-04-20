import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CreateProject1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.xpath("//td[@class='navItem navCell relative notSelected']")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[text()='+ New Project']")).click();
		driver.findElement(By.xpath("//input[@class='projectNameField inputFieldWithPlaceholder']")).sendKeys("HDFC Bank");
		driver.findElement(By.xpath("//button[contains(text(),'Please Select')]")).click();
		driver.findElement(By.xpath("//a[text()='SBI_007']")).click();
		driver.findElement(By.name("projectDescriptionField")).sendKeys("project");
		driver.findElement(By.xpath("//span[text()='Create Project']")).click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement e=driver.findElement(By.xpath("//div[text()='HDFC']"));
		wait.until(ExpectedConditions.textToBePresentInElement(e, "HDFC"));

		Assert.assertEquals(e.getText(), "HDFC");

	}

}
