import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfCheckboxInActiTime {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		boolean Checkbox=driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		if(Checkbox)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
			
		}
		driver.quit();
	}
	
	
	}


