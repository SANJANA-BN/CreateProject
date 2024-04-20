

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().setPosition(new Point(111,400));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(555,456));
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		Point p=driver.manage().window().getPosition();
		Thread.sleep(2000);
		int XAxis=p.getX();
		int YAxis=p.getY();
		Dimension d=driver.manage().window().getSize();
		Thread.sleep(2000);
		int height=d.getHeight();
		Thread.sleep(2000);
		int width=d.getWidth();
		Thread.sleep(2000);
		System.out.println("the x axis value of browser"+XAxis);
		System.out.println("the y axis value of browser"+YAxis);
		System.out.println("the height of browser"+height);
		System.out.println("the width of browser"+width);
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.quit();
	}

		
		
		
		
		

	}

