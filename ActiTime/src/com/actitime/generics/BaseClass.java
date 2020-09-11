package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public WebDriver driver;
	public FileLib f = new FileLib();
	
@BeforeClass
public void testopenbrowser() throws IOException { 
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
}
@AfterClass
public void testclosebrowser() {
	driver.close();
}

@BeforeMethod
public void testlogin() throws IOException {
	String url = f.getpropertyvalue("url");
	String un = f.getpropertyvalue("un");
	String pw = f.getpropertyvalue("pw");
	driver.get(url);
	LoginPage l = new LoginPage(driver);
	l.setlogin(un , pw);
}

@AfterMethod
public void testlogout() {
	HomePage h = new HomePage(driver);
	h.logout();

}
}
