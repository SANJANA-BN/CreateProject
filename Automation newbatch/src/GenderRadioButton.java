import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenderRadioButton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement link=driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		 link.click();	 
		 Thread.sleep(2000);
		   int y1=driver.findElement(By.xpath("(//input[@type='radio'])[1])")).getLocation().getY();
		   Thread.sleep(2000);
		   int y2=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).getLocation().getY();
		   Thread.sleep(2000);
		   int y3=driver.findElement(By.xpath("//input[@type='radio'])[3])")).getLocation().getY();
		   Thread.sleep(2000);
		   if(y1==y2&&y2==y3&&y3==y1)
		   {
			   System.out.println("Gender radio button is properly alligned");
		   }
		   else
		   { System.out.println("Gender radio button is not properly alligned");
		   
		   }
		   driver.quit();		

	}

}
