package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
@FindBy(id="logoutLink")
private WebElement lout;
@FindBy(id="container_tasks")
private WebElement tasktab;

@FindBy(xpath="//span[text()='New']")
private WebElement ClickOnNew;

@FindBy(xpath="//div[text()='- Select Customer -']")
private WebElement SelectCustomermenu;

@FindBy(xpath="//div[text()='- New Customer -']")
private WebElement Newcustomer;

@FindBy(xpath="//input[contains(@placeholder,'Enter Customer Name')]")
private WebElement Customername;

@FindBy(xpath="//input[contains(@placeholder,'Enter Project Name')]")
private WebElement Projectname;

@FindBy(xpath="//input[contains(@placeholder,'Enter task name')]")
private WebElement Taskame;

@FindBy(xpath="//div[text()='Create Tasks']")
private WebElement ClickonCrateTask;


public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void logout() {
	lout.click();
}

public void clickontasktab() {
	tasktab.click();
}
public WebElement getLout() {
	return lout;
}
public WebElement getTasktab() {
	return tasktab;
}
public WebElement getClickOnNew() {
	return ClickOnNew;
}
public WebElement getSelectCustomermenu() {
	return SelectCustomermenu;
}

public WebElement getNewcustomer() {
	return Newcustomer;
}
public WebElement getCustomername() {
	return Customername;
}
public WebElement getProjectname() {
	return Projectname;
}
public WebElement getTaskame() {
	return Taskame;
}
public WebElement getClickonCrateTask() {
	return ClickonCrateTask;
}

}