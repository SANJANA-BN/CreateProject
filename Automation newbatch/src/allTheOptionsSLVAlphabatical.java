import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.OffsetMapping.Sort;

public class allTheOptionsSLVAlphabatical {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/Desktop/multiselect.html");
WebElement slvlistbox=driver.findElement(By.id("slv"));
Select s=new Select(slvlistbox);
List<WebElement>alloptions=s.getOptions();
int count=alloptions.size();
for(int i=0;i<count;i++) {
	String text=alloptions.get(i).getText();
	System.out.println(text);
}
ArrayList al=new ArrayList();
al.add("idly");
al.add("dosa");
al.add("vada");
al.add("chapati");
al.add("poori");
al.add("kharabath");
al.add("chowchowbath");
al.add("paddu");
al.add("idly");

ArrayList arrayList=new ArrayList<>();
ArrayList arrayList2 = new ArrayList();
arrayList2.sort((Comparator) al);
System.out.println(al);

	}

	

		
	
}

		

	





	


