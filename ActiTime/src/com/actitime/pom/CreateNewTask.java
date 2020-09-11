package com.actitime.pom;

import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

public class CreateNewTask extends BaseClass {

	@Test
	public void testcreatecustomer() {
		HomePage  h = new HomePage(driver);
		h.getClickOnNew().click();
		h.getSelectCustomermenu().click();
		h.getNewcustomer().click();
		h.getCustomername().sendKeys("HDFC_001");
		h.getProjectname().sendKeys("Banking project");
		h.getTaskame().sendKeys("Banking");
		h.getClickonCrateTask().click();
	}
}
