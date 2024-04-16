package com.Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listener extends BaseClass implements ITestListener {
	ExtentReports extent = ExtentReportGenerator.getReport();
	ThreadLocal<ExtentTest> extenttest = new ThreadLocal<ExtentTest>();
	static Logger logger = LogManager.getLogger(Library.class);

	public void onTestStart(ITestResult result) {
		String methodname = result.getTestClass().getName() + "==" + result.getMethod().getMethodName();
		logger.info("*****************************************  " + methodname
				+ "  *****************************************************");

		Library.test = extent.createTest(result.getTestClass().getName() + "==" + result.getMethod().getMethodName());
		extenttest.set(Library.test);
	}

	public void onTestSuccess(ITestResult result) {
		extenttest.get().log(Status.PASS, "Test Case Pass..");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshot());

	}

	public void onTestFailure(ITestResult result) {
		extenttest.get().log(Status.FAIL, "Test Case Fail..");
		extenttest.get().addScreenCaptureFromBase64String(getScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		extenttest.get().log(Status.SKIP, "Test Case Skip..");
	}

	public void onFinish(ITestContext context) {
		extent.flush();

	}

	public static String getScreenshot() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		return ts.getScreenshotAs(OutputType.BASE64); // to send screenshot when mail so create Base64
		// format to send tk screenshot in string frmt &
		// can send with mail
	}

}
