import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demoB {
	public static void main(String[]args)
	{
		WebDriver driver=new ChromeDriver();
		demoA.testA(driver);
		WebDriver driver1=new FirefoxDriver();
		demoA.testA(driver1);
	}

}
