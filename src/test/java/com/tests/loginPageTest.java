package com.tests;



import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.module.BaseClass;
import com.pomClasses.LoginPomPage;


public class loginPageTest extends BaseClass {
	@BeforeClass
	public void setup() throws InterruptedException {
	getWebDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void teardown() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.close();
	}
	
	@Test
	public void pageURL() {
		String currentPageURL=driver.getCurrentUrl();
		if(currentPageURL.equalsIgnoreCase("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")) {
			System.out.println("You are connected to LogIn page...Test pass");
			
		}
		
	}
	
	@Test
	public void TestLogin() throws InterruptedException {
	LoginPomPage login=new LoginPomPage();
	login.setUsername();
	login.setPassword();
	//Thread.sleep(5000);
	login.logIn();
	Thread.sleep(5000);
	try {
	login.testForInvalidCredential();
	}
	catch(Exception e) {
		System.out.println("Valid Crendential");
	}
	Thread.sleep(5000);
	login.testForSuccessfulLogin();
	
	}
	
	
}
