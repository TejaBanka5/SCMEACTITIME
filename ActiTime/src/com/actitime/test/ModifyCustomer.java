package com.actitime.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;

@Listeners(com.actitime.generics.ListenersImplementation.class)
public class ModifyCustomer extends BaseClass {

	@Test
	public void testmodifycustomer() {
		Assert.fail();
	}
}
