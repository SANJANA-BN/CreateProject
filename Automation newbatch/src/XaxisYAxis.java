import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XaxisYAxis {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		int x1=driver.findElement(By.id("loginButton")).getLocation().getX();
		int y1=driver.findElement(By.id("loginButton")).getLocation().getY();
		System.out.println(x1);
		System.out.println(y1);
		driver.quit();
		
		

	}

}
