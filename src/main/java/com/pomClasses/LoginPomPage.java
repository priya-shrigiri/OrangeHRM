package com.pomClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.module.BaseClass;

import dev.failsafe.internal.util.Assert;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoginPomPage extends BaseClass{
	

	public LoginPomPage() {
		PageFactory.initElements(driver, this);
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
	
	@FindBy(xpath="(//p[@class='oxd-text oxd-text--p oxd-alert-content-text'])[1]")
	private WebElement invalidCredentials;
	
	@FindBy(xpath="//h6[normalize-space()='Dashboard']")
	private WebElement dashBoard;
	
	public String getUsername() {
		return userNameText.getText().substring(11);
	}
	public String getPassword() {
		return passwordText.getText().substring(11);
	}
	
	public void setUsername() {
		userName.sendKeys(getUsername());
	}
	
	public void setPassword() {
		password.sendKeys(getPassword());
	}
	
	public void logIn() {
		login.click();
	}
   
	public void testForInvalidCredential() {
		String actualMsg=invalidCredentials.getText();
		System.out.println(actualMsg + "Please Enter valid UserId And Password"); 
	}	
	
	public void testForSuccessfulLogin() {
		String requiredMsg="Dashboard";
		String actualMsg=dashBoard.getText();
		Assert.isTrue(true, actualMsg,requiredMsg );
		System.out.println("*****WELCOME*****");
	}
	
	}

