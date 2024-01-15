package com.java.ecommerce.pageUI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.ecommerce.SorgaBasepage.Sorgabasepage;

public class Login_Sworga extends Sorgabasepage{

	@FindBy (id = "user-name") WebElement txtUsername;
	@FindBy (id = "password") WebElement txtpassword;
	@FindBy(id = "login-button") WebElement btnLogin;
	
	public Login_Sworga(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void login() throws Exception {
		Thread.sleep(2000);
		txtUsername.sendKeys(getData("username"));
		txtpassword.sendKeys(getData("passwords"));
		btnLogin.click();
	}
}
