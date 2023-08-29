package packagges;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Login_Retesting  {
	public WebDriver driver;
	public FileInputStream fi ;
	public Workbook ww;
	public Sheet srt,stt ,st1 ;
  @Test
  public void f() throws Exception {
	 
	  fi= new FileInputStream("D:\\LIBRARY\\EXCELData\\OR\\LoginOR.xls");
	  ww = Workbook.getWorkbook(fi);
	  srt = ww.getSheet("Sheet5");
	  stt= ww.getSheet("Sheet3");
	  st1= ww.getSheet("Sheet4");
	  for (int i = 1; i <srt.getRows(); i++) {
		  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
			ChromeOptions s = new ChromeOptions();
			s.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(s);
			driver.get("https://www.saucedemo.com");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	  driver.findElement(By.id(stt.getCell(0,1).getContents())).sendKeys(srt.getCell(0,i).getContents());
	  driver.findElement(By.id(stt.getCell(1,1).getContents())).sendKeys(srt.getCell(1,i).getContents());
	  driver.findElement(By.id(stt.getCell(2,1).getContents())).click();
	  Thread.sleep(1000);
	 try {
		  driver.findElement(By.id(st1.getCell(0,0).getContents())).click();
		  Thread.sleep(1000);
		  driver.findElement(By.id(st1.getCell(1,0).getContents())).click();
		  System.out.println("Valid credential ");
		  System.out.println("Logout succesufully");
	} catch (Exception e) {
		System.out.println("This the invalid credential ");
			 
	}
  }
	 System.out.println("The loop will completed");
	 driver.quit();
  }
}
