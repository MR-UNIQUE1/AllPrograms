package com.java.ecommerce.listeners;

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

import com.java.ecommerce.basepage.AUTP_Basepage;

public class Listeners extends AUTP_Basepage implements ITestListener {
	public void onTestStart(ITestResult args0) {
		Reporter.log("Test started running "+args0.getClass().getName());
	}
	public void onTestSuccess (ITestResult args0) {
		Reporter.log("Test is sucess"+args0.getClass().getName());
		Calendar u = Calendar.getInstance();
		SimpleDateFormat simpleDate= new SimpleDateFormat("dd_mm_yyyy_hh_mm_ss");
		String methoName= args0.getName();
		if (args0.isSuccess()) {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String reports = (new File(System.getProperty("user.dir")).getAbsolutePath()+
				"/src/main/java/com/java/ecommerce");
		File target= new File((String)reports+"/passedScreen"+methoName+simpleDate.format(u.getTime())+".png");
		try {
			FileUtils.copyDirectory(src, target);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void onTestSkipped(ITestResult args0) {
		Reporter.log("Test is skipped"+args0.getClass().getName());
	}
	public void onTestFailure(ITestResult args0) {
		Reporter.log("Test is failed "+args0.getClass().getName());
	}
}
