package com.actitime.test;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generics.ListenersImplementation.class)
public class CreateCustomer extends BaseClass{

@Test(groups = "smoketest")
public void testcreatecust() throws InterruptedException {
	HomePage h = new HomePage(driver);
	h.clickontasktab();
	TaskListPage t = new TaskListPage(driver);
	t.getAddnew().click();
	t.getNewCustomerMenu().click();
	t.getEnterCustomerName().sendKeys("HDFC_008");
	t.getEnterCustomerDescription().sendKeys("Banking project");
	t.getProjectdropdown().click();
	t.getOurcompanyMenu().click();
	t.getCreatecustomer().click();
	Thread.sleep(7000);
	String Actualtitile = t.getActualtitile().getText();
	Assert.assertEquals(Actualtitile, "HDFC_008");
}

@Test()
public void testdeletecustomer() {
	HomePage h = new HomePage(driver);
	h.clickontasktab();
	TaskListPage t = new TaskListPage(driver);
	WebDriverWait wait = new WebDriverWait(driver,10);
	wait.until(ExpectedConditions.titleIs("HDFC_008"));
	t.getEditcustomer().click();
}
}
