package pageObjects;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SerchCustomerPage {
	public WebDriver ldriver;
	
	@SuppressWarnings("deprecation")
	public SerchCustomerPage(WebDriver rDriver) {
		ldriver= rDriver;
		PageFactory.initElements(ldriver, this);
		//WebDriverWait wait = new WebDriverWait(ldriver, 29);
		ldriver.manage().timeouts().implicitlyWait(10,TimeUnit.MICROSECONDS);
	}
	@FindBy(xpath = "//input[@id='SearchEmail']")WebElement txtEmail;
	@FindBy(xpath = "//button[@id='search-customers']")WebElement btnClick;
	@FindBy(xpath = "//table[@id='customers-grid']/tbody/tr[\"+i+\"]/td[2]")List<WebElement> tableColoum;
	@FindBy(xpath = "//*[@id=\"customers-grid\"]/tbody/tr/td[1]")List<WebElement>tableRows;
	@FindBy(xpath = "//*[@id=\"customers-grid\"]")WebElement table;
	
	public void SearchEmail(String email) {
		
		txtEmail.clear();
		txtEmail.sendKeys(email);
		}
	public void clickSearch() {
		btnClick.click();
	}
	public int getNoOfColumns() {
		return (tableColoum.size());
	}
	public int getNoOfRows() {
		return (tableRows.size());
	}
	
	public boolean searchCustomerByEmail(String email) {
		boolean flag = false ;
		for (int i = 1; i <=getNoOfColumns(); i++) {
			String emailid = table.findElement(By.xpath("//*[@id=\"customers-grid\"]/tbody/tr/td[2]")).getText();
			System.out.println(email);
			
			if (emailid.equals(email)) {
				flag = true;
			}
		}
		return flag;
	}
}
