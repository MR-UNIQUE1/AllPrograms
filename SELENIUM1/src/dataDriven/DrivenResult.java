package dataDriven;

import java.io.FileInputStream;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class DrivenResult {
	public WebDriver driver;
	public FileInputStream fi ;
	public Workbook wb ;
	public Sheet st;
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("D:\\LIBRARY\\EXCELData\\DataDriven\\Driven.xls");
	  wb = Workbook.getWorkbook(fi);
	  st=wb.getSheet("Sheet1");
	  for (int i = 1; i <st.getRows(); i++) {
		new WebDriverWait(driver, Duration.ofSeconds(2));
		if (st.getCell(2,i).getContents().equalsIgnoreCase("textbox")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).sendKeys(st.getCell(3,i).getContents());
		} else if (st.getCell(2,i).getContents().equalsIgnoreCase("button")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);
		} else if(st.getCell(2,i).getContents().equalsIgnoreCase("url")){
			driver.get(st.getCell(0,i).getContents());
		}
	  }
  }
  @BeforeTest
  public void beforeTest()throws Exception {
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
