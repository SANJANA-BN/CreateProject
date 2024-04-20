import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginIsEnabled {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	boolean login=driver.findElement(By.name("login")).isEnabled();
	if(login)
	{
		System.out.println("login button is enabled");
	}
	else
	{
		System.out.println("login button is not enabled");
	}
driver.quit();
	}

}
