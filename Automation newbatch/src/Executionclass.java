import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Executionclass {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		Demo.testA(driver);
		EdgeDriver driver1=new EdgeDriver();
		Demo.testA(driver1);
		
		
		// TODO Auto-generated method stub

	}

}
