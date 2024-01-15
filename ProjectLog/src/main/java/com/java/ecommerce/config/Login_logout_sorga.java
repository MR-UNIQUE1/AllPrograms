package com.java.ecommerce.config;
import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v113.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.ecommerce.basepage.LunchBro;

public class Login_logout_sorga extends LunchBro{
	public static WebDriver driver;
	
	
	@FindBy(id = "user-name")WebElement txtUsername;
	@FindBy(id = "password")WebElement txtPassword;
	
	@FindBy(id = "login-button")WebElement btnLogin;
	@FindBy(xpath = "//span[@class='title']")WebElement txtProduct;
	@FindBy(id = "react-burger-menu-btn")WebElement btnImage;
	@FindBy(id = "logout_sidebar_link")WebElement txtLogout;
	
	public Login_logout_sorga(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void verify() throws Exception {
		
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
