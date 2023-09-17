package com.java.dataEntry;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import basepage.Login_Sorga;

public class Listerens extends Login_Sorga implements ITestListener {
	 public void onTestStart (ITestResult args) {
		 Reporter.log("Test start running "+ args.getClass().getName());
	 }
	 public void onTestSkipped(ITestResult args) {
		 Reporter.log("Test is skipped "+ args.getClass().getName());
	 }
	 public void onTestFailure(ITestResult args) {
		 Reporter.log("Test is failed "+ args.getClass().getName());
	 }
	 public void onTestSuccess(ITestResult args) {
		 Reporter.log("Test is success "+args.getClass().getName());
		 Calendar cal = Calendar.getInstance();
		SimpleDateFormat simple = new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		String ss= args.getName();
		if (args.isSuccess()) {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String rd = (new File(System.getProperty("user.dir")).getAbsolutePath()+
					"/src/main/java/com/java");
			File tar = new File((String)rd+"/listerens/"+ ss + simple.format(cal.getTime())+".png");
			try {
				FileUtils.copyFile(src, tar);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	 }
}
