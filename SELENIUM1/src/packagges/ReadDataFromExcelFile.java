package packagges;

import java.io.FileInputStream;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class ReadDataFromExcelFile {
  @Test
  public void f() throws Exception{
	  FileInputStream fi= new FileInputStream("D:\\LIBRARY\\EXCELData\\My ExcelData\\UnamePass.xls");
	  Workbook w =  Workbook.getWorkbook(fi);	
	  Sheet s = w.getSheet("Sheet1");
	  System.out.println(s.getCell(0,0).getContents());
	  System.out.println(s.getCell(1,0).getContents());
	  System.out.println(s.getCell(0,1).getContents());
	  System.out.println(s.getCell(1,1).getContents());
	  System.out.println(s.getCell(0,2).getContents());
	  System.out.println(s.getCell(1,2).getContents());
  }
}
