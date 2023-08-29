package dataDriven;

import java.io.FileOutputStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class CreatExcelFile {
	public static WebDriver driver;
	public FileOutputStream fo;
	public WritableWorkbook ws ;
	public WritableSheet wb ;
  @Test
  public void f() throws Exception {
	  fo= new FileOutputStream("D:\\LIBRARY\\EXCELData\\DataDriven\\Driven.xls");
	  ws = Workbook.createWorkbook(fo);
	  wb= ws.createSheet("Sheeet", 0);
  }

}
