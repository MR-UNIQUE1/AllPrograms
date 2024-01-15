package com.mr.project.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginStatus {
	@FindBy(id = "user-name")WebElement txtUserName ;
	@FindBy(id = "password") WebElement txtPassWord ;
	@FindBy(id = "login-button") WebElement btmLogin ;
	@FindBy(id = "react-burger-menu-btn") WebElement btnClick ;
	@FindBy(id = "logout_sidebar_link") WebElement btnLogout ;
	
	public LoginStatus(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void Sorgaslogin () throws Exception {
		txtUserName.click();
		txtUserName.sendKeys("standard_user");
		txtPassWord.sendKeys("secret_sauce");
		btmLogin.click();
		Thread.sleep(1000);
	}
	public void Sorgaalogout () throws InterruptedException {
		btnClick.click();
		Thread.sleep(1000);
		btnLogout.click();
	}
	
}
