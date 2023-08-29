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

public class LoginWithOR {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wk;
	public Sheet sst ,st,st1;
  @Test
  public void f() throws Exception {
	  fi= new FileInputStream("D:\\LIBRARY\\EXCELData\\OR\\LoginOR.xls");
	  wk = Workbook.getWorkbook(fi);
	  st= wk.getSheet("Sheet2");
	  sst= wk.getSheet("Sheet3");
	  driver.findElement(By.id(sst.getCell(0,1).getContents())).sendKeys(st.getCell(0,1).getContents());
	  driver.findElement(By.id(sst.getCell(1,1).getContents())).sendKeys(st.getCell(1,1).getContents());
	  driver.findElement(By.id(sst.getCell(2,1).getContents())).click();
  }
  @Test
  public void logout () throws InterruptedException {
	  st1=wk.getSheet("Sheet4");
	  driver.findElement(By.id(st1.getCell(0,0).getContents())).click();
	  Thread.sleep(1000);
	  driver.findElement(By.id(st1.getCell(1,0).getContents())).click();
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
