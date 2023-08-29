package packagges;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreatExcelFile {
	public WebDriver driver;
	public FileInputStream fi;
	public Workbook sb;
	public Sheet st ,srt,stt ,st1 ;
	
	public FileOutputStream fo;
	public WritableWorkbook wr ;
	public WritableSheet ws ;
  @Test
  public void f() throws Exception {
	 fi = new FileInputStream("D:\\LIBRARY\\EXCELData\\OR\\LoginOR.xls");
	 sb = Workbook.getWorkbook(fi);
	 st = sb.getSheet("Sheet5");
	 srt = sb.getSheet("Sheet5");
	  stt= sb.getSheet("Sheet3");
	  st1= sb.getSheet("Sheet4");
	 String stte ;
	 fo = new FileOutputStream("D:\\LIBRARY\\EXCELData\\ExcelResult\\Result.xls");
	 wr = Workbook.createWorkbook(fo);
	 ws = wr.createSheet("Result11", 0);
	 for (int i = 0; i < st.getRows(); i++) {
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
			  stte = "pass";
		} catch (Exception e) {
			System.out.println("This the invalid credential ");
			  stte = "fail";
	}
		 jxl.write.Label ne = new jxl.write.Label(2, i, stte);
		 ws.addCell(ne);
		 for (int j = 0; j <st.getColumns(); j++) {
			System.out.println(st.getCell(j,i).getContents());
			jxl.write.Label ff = new jxl.write.Label(j,i,st.getCell(j,i).getContents());
			ws.addCell(ff);
		}
		jxl.write.Label res = new jxl.write.Label(2,0,"Resultts");
		ws.addCell(res);
		wr.write();
		wr.close();
  }
	 }

}