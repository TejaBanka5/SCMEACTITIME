package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.util.thread.Scheduler.Task;

public class TaskListPage {
	
@FindBy(xpath="//div[text()='Add New']")
private WebElement Addnew;

@FindBy(xpath="//div[contains(@class,'item createNewCustomer')]")
private WebElement NewCustomerMenu;

@FindBy(xpath="//input[contains(@class,'inputFieldWithPlaceholder newNameField inputNameField')]")
private WebElement EnterCustomerName;

@FindBy(xpath="//textarea[contains(@placeholder,'Enter Customer Description')]")
private WebElement EnterCustomerDescription;

@FindBy(xpath="//div[text()='- Select Customer -']")
private WebElement Projectdropdown;

@FindBy(xpath="//div[@class='itemRow cpItemRow ' and text()='Our company']")
private WebElement OurcompanyMenu;

@FindBy(xpath="//div[text()='Create Customer']")
private WebElement Createcustomer;

@FindBy(xpath="//div[@class='title' and @title]")
private WebElement Actualtitile;

@FindBy(xpath="//div[@class='title' and @title]/../div[2]")
private WebElement Editcustomer;

@FindBy(xpath="(//div[contains(@class,'actionButton')])[7]")
private WebElement Actionbutton;

public TaskListPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public WebElement getAddnew() {
	return Addnew;
}

public WebElement getNewCustomerMenu() {
	return NewCustomerMenu;
}

public WebElement getEnterCustomerName() {
	return EnterCustomerName;
}

public WebElement getEnterCustomerDescription() {
	return EnterCustomerDescription;
}

public WebElement getProjectdropdown() {
	return Projectdropdown;
}

public WebElement getOurcompanyMenu() {
	return OurcompanyMenu;
}

public WebElement getCreatecustomer() {
	return Createcustomer;
}
public WebElement getActualtitile() {
	return Actualtitile;
}

public WebElement getEditcustomer() {
	return Editcustomer;
}

public WebElement getActionbutton() {
	return Actionbutton;
}


}
