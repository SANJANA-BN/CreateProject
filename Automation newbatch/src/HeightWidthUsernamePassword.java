import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWidthUsernamePassword {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		WebElement username=driver.findElement(By.id("username"));
		WebElement password=driver.findElement(By.name("pwd"));
		int h1=username.getLocation().getX();
		int w1=username.getLocation().getY();
		int h2=password.getLocation().getX();
		int w2=password.getLocation().getY();
		if(h1==h2&&w1==w2)
		{
			System.out.println("Height and width of user name password is equal");
		}
		else
		{
			System.out.println("Height and width of user name password is not equal");
		}
		System.out.println(h1+" "+w1);
		System.out.println(h2+" "+w2);
	
driver.quit();
	}

}
