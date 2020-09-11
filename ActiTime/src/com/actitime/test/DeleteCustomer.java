package com.actitime.test;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

public class DeleteCustomer extends BaseClass {
	
@Test(groups = "regresiontest")
public void testdeletecustomer() {
	HomePage h = new HomePage(driver);
	h.clickontasktab();
	TaskListPage t = new TaskListPage(driver);
	t.getEditcustomer().click();
	t.getActionbutton().click();
}
}
