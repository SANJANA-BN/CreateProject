import java.awt.peer.SystemTrayPeer;

import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	 String title=driver.getTitle();
	 System.out.println(title);
	 driver.quit();
	 

	}

}
