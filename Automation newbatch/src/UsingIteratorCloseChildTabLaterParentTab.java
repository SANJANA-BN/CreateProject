import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIteratorCloseChildTabLaterParentTab {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("http://localhost/login.do");
driver.findElement(By.linkText("actiTIME Inc.")).click();
Set<String>allwh=driver.getWindowHandles();

	}

}
