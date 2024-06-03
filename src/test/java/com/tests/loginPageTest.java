package com.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginPageTest {
	@FindBy(By.xpath("//p[text()='Username : Admin']\"")
	private WebElement userNameText();
	//p[text()='Password : admin123'] // password
	
	//input[@name='username']  // to fill username
	
	//input[@name='password']    //to fill password
	
	//button[@type='submit']    // to submit
	//@FindBy(xpath="//p[text()='Username : Admin']")
}
