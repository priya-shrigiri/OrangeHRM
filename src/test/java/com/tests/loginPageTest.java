package com.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.module.BaseClass;

public class loginPageTest extends BaseClass {
	@BeforeClass
	public void setup() {
		getWebDriver();
	}
	
	@AfterClass
	public void teardown() {
		getWebDriver().close();
	}
	
	@Test
	public void pageURL() {
		String currentPageURL=getWebDriver().getCurrentUrl();
		if(currentPageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("You are connected to LogIn page...Test pass");
		}
	}
	
	
}
