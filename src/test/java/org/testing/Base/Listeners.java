package org.testing.Base;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import ECMS.Resources.Extentreport;



public class Listeners extends Baseclass implements  ITestListener{

	private WebDriver driver;
    
    ExtentTest test;
	ExtentReports extent = Extentreport.getReportObject();
	
	@Override
	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());


	}

	@Override
	public void onTestSuccess(ITestResult result) {

		test.log(Status.PASS, "Test Passed");
	}

	@Override
    public void onTestFailure(ITestResult result) {
//	    this.test= null;
		test.log(Status.FAIL, "Test Failed");
		test.fail(result.getThrowable());
		
		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }

		String filepath = null;
	
		try {
			filepath = getscreenshot(result.getMethod().getMethodName(), driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			test.addScreenCaptureFromPath(filepath, result.getMethod().getMethodName());
		} catch (IllegalArgumentException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
		//Screenshot
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

//	public String getscreenshot(String methodName, WebDriver driver2) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
     public void onTestSkipped(ITestResult result) {

		test.log(Status.PASS, "Test Passed");

	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();


	}





}
