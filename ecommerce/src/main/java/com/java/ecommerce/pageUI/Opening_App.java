package com.java.ecommerce.pageUI;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.java.ecommerce.basepage.BasePage;

public class Opening_App extends BasePage {
	
	@FindBy (id = "user-name") WebElement txtUsername ;
	@FindBy(id = "password") WebElement txtPassword ;
	@FindBy(id = "login-button") WebElement btnLogin ;
	@FindBy(xpath = "//span[text()='Products']") WebElement txtProducts ; 
	
	public Opening_App(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Login () throws Exception{
		txtUsername.sendKeys(getData("username"));
		txtPassword.sendKeys(getData("password"));
		btnLogin.click();
		Thread.sleep(4000);
		assertEquals(txtProducts.getText(), "Products");
	}
}
