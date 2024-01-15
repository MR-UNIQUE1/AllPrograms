package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WaitHelper {
	public WebDriver driver;

	public WaitHelper(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public void waitForElement(WebElement element , long timeOutINSecond) {
		//WebDriverWait wait = new WebDriverWait(driver, timeOutINSecond)
	}
}
