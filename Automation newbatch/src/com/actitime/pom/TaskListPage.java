package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newproject;
	@FindBy(xpath="//input[@class='projectNameField inputFieldWithPlaceholder']")
	private WebElement EntrProjectName;
	@FindBy(xpath="//button[contains(text(),'Please Select')]")
	private WebElement Customer;
	@FindBy(xpath="//a[text()='SBI_007']")
	private WebElement SBI;
	@FindBy(name="projectDescriptionField")
	private WebElement projectDesc;
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement CreateProject;
	@FindBy(xpath="//div[@class='navigationLinks']/../div[2]")
	private WebElement VerifyProject;

	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}
	public WebElement getnewproject()
	{
		return newproject;
	}
	public WebElement getEntrProjectName()
	{
		return EntrProjectName;
	}
	public WebElement getCustomer() {
		return Customer;
	}
	public WebElement getSBI()
	{
		return SBI;
	}
	public WebElement getprojectDesc()
	{
		return projectDesc;
	}
	public WebElement getCreateProject()
	{
		return CreateProject;
	}
	public WebElement getVerifyProjectName() {
		return VerifyProject;
}}
