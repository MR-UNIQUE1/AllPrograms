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

public class LoginWithORMultipleSetsOfdata {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb;
	public Sheet stt , sr,st1;
  @Test
  public void login() throws Exception {
	  fi= new FileInputStream("D:\\LIBRARY\\EXCELData\\OR\\LoginOR.xls");
	  wb = Workbook.getWorkbook(fi);
	  stt= wb.getSheet("Sheet3");
	  sr= wb.getSheet("Sheet5");
	  st1 = wb.getSheet("Sheet4");
	  driver.findElement(By.id(stt.getCell(0,1).getContents())).sendKeys(sr.getCell(0,3).getContents());
	  driver.findElement(By.id(stt.getCell(1,1).getContents())).sendKeys(sr.getCell(1,1).getContents());
	  driver.findElement(By.id(stt.getCell(2,1).getContents())).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id(st1.getCell(0,0).getContents())).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id(st1.getCell(1,0).getContents())).click();
  }
  @BeforeTest
  public void beforeTest()throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
