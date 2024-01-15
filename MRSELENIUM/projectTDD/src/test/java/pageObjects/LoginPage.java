package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	@FindBy(xpath = "//input[@id='Email']")WebElement em;
	@FindBy(xpath = "//input[@id='Password']")WebElement ps;
	@FindBy(xpath = "//button[@type='submit']")WebElement log;
	@FindBy(xpath = "//*[@id=\"navbarText\"]/ul/li[3]/a")WebElement out;
	public void emailEnter(String uname) {
		em.clear();
		em.sendKeys(uname);
	}
	public void passEnter (String password) {
		ps.clear();
		ps.sendKeys(password);
	}
	public void clicklogin() {
		log.click();
	}
	public void clickLogout() {
		out.click();
	}
	
}
