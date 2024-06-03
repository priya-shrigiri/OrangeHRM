package com.pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.module.BaseClass;

public class LoginPomPage extends BaseClass{
	
	public LoginPomPage() {
		PageFactory.initElements(getWebDriver(), this);
	}
	
	@FindBy(xpath="//p[text()='Username : Admin']")
	private WebElement userNameText;
	
	@FindBy(xpath="//p[text()='Password : admin123']")
	private WebElement passwordText;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	

}
