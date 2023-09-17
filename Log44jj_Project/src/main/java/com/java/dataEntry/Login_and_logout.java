package com.java.dataEntry;

import static org.testng.Assert.assertEquals;
import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepage.Login_Sorga;

public class Login_and_logout extends Login_Sorga{
	Logger log = LogManager.getLogger(Login_and_logout.class.getName());
	
	@FindBy(id = "user-name")WebElement txtUsername;
	@FindBy(id = "password")WebElement txtPassword;
	
	@FindBy(id = "login-button")WebElement btnLogin;
	@FindBy(xpath = "//span[@class='title']")WebElement txtProduct;
	@FindBy(id = "react-burger-menu-btn")WebElement btnImage;
	@FindBy(id = "logout_sidebar_link")WebElement txtLogout;
	
	public Login_and_logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void login() throws Exception {
		log.info("8***************************************************");
		
		txtUsername.sendKeys(getData("username"));
		txtPassword.sendKeys(getData("password"));
		btnLogin.click();
		Thread.sleep(2000);
		assertEquals(txtProduct.getText(), "Products");
		btnImage.click();
		Thread.sleep(2000);
		txtLogout.click();
		
	}
}
