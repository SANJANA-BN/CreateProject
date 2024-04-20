package com.actitime.testscript1;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLib;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;
@Listeners(com.actitime.generic.ListnersImplementation.class)

public class CustomerModule extends BaseClass {
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException {
	Reporter.log("createCustomer",true);
	FileLib f=new FileLib();
	String ProjectName=f.getExcelData("CreateProject",1,3);
	String Projectdescription=f.getExcelData(ProjectName, 1, 2);
	HomePage h=new HomePage(driver);
	h.setTaskTab();
	TaskListPage t=new TaskListPage(driver);
	t.getAddNewBtn().click();
	t.getAddNewBtn().click();
	t.getEntrProjectName().sendKeys(ProjectName);
	t.getCustomer().click();
	t.getSBI().click();
	t.getprojectDesc().sendKeys(Projectdescription);
	t.getCreateProject().click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	WebElement e=driver.findElement(By.xpath("//div[text()='HDFC']"));
	wait.until(ExpectedConditions.textToBePresentInElement(e, "HDFC"));
	Assert.assertEquals(e.getText(), "HDFC");
String actualCustomer=t.getVerifyProjectName().getText();
Assert.assertEquals(actualCustomer,ProjectName);
	}

}
