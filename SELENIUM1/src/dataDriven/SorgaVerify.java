package dataDriven;

import java.io.FileInputStream;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class SorgaVerify {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook wb ;
	public Sheet st ;
  @Test
  public void f() throws Exception {
	  fi= new FileInputStream("D:\\LIBRARY\\EXCELData\\DataDriven\\Sorga.xls");
	  wb=Workbook.getWorkbook(fi);
	  st= wb.getSheet("Sheet1");
	  for (int i = 1; i <st.getRows(); i++) {
		if (st.getCell(2,i).getContents().equalsIgnoreCase("radio button")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);	
		}else if (st.getCell(2,i).getContents().equalsIgnoreCase("url")) {
			driver.get(st.getCell(0,i).getContents());
			Thread.sleep(1000);	
		}else if(st.getCell(2,i).getContents().equalsIgnoreCase("select button")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);				
		}
		else if(st.getCell(2,i).getContents().equalsIgnoreCase("dropdown")) {
			new Select(driver.findElement(By.xpath(st.getCell(0,i).getContents()))).
			selectByVisibleText(st.getCell(3,i).getContents());
			Thread.sleep(1000);
		}else if(st.getCell(2,i).getContents().equalsIgnoreCase("check box")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);	
		}else if (st.getCell(2,i).getContents().equalsIgnoreCase("window")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);
			Set<String > st = driver.getWindowHandles();
			Object [] o = st.toArray();
			driver.switchTo().window((String)o[1]);
			driver.findElement(By.xpath("//a[contains(text(),'Blog')]")).click();
			Thread.sleep(4000);
			driver.close();
		}else if(st.getCell(2,i).getContents().equalsIgnoreCase("tab")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(4000);
			driver.close();
		}
		else if(st.getCell(2,i).getContents().equalsIgnoreCase("button")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);
		}else if(st.getCell(2,i).getContents().equalsIgnoreCase("alert")) {
			driver.findElement(By.xpath("//input[@id='name']")).sendKeys("sunil");
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).click();
			Thread.sleep(1000);
			String ssf= driver.switchTo().alert().getText();
			System.out.println(ssf);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
	   }else if(st.getCell(2,i).getContents().equalsIgnoreCase("link")) {
		   	driver.findElement(By.linkText(st.getCell(0,i).getContents())).click();
		   	Thread.sleep(1000);
		   	driver.close();
	  }else if(st.getCell(2,i).getContents().equalsIgnoreCase("textbox")) {
			driver.findElement(By.xpath(st.getCell(0,i).getContents())).sendKeys(st.getCell(3,i).getContents());
			Thread.sleep(1000);
			driver.close();
	  }
	}
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "D:\\LIBRARY\\chromedriver.exe");
		ChromeOptions s = new ChromeOptions();
		s.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(s);
		driver.manage().window().maximize();
		Thread.sleep(3000);
  }

}
