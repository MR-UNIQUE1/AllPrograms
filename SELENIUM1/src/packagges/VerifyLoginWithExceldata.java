package packagges;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class VerifyLoginWithExceldata {
	public static WebDriver driver;
	public FileInputStream fi ;
	public Workbook ww;
	public Sheet st ;
  @Test
  public void Verify_Login() throws Exception {
	  fi= new FileInputStream("D:\\LIBRARY\\EXCELData\\My ExcelData\\SHEET2.xls");
	  ww= Workbook.getWorkbook(fi);
	  st= ww.getSheet("Sheet2");
	  driver.findElement(By.id("user-name")).sendKeys(st.getCell(0,1).getContents());
	  driver.findElement(By.id("password")).sendKeys(st.getCell(1,1).getContents());
	  driver.findElement(By.id("login-button")).click();
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
