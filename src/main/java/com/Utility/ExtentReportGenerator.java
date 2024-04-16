package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	public static ExtentReports extent;

	public static ExtentReports getReport() {
		String path = "C:\\Users\\Windows 10\\eclipse-workspace\\WebAutomation\\Reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("ABC Web Automation Report");
		reporter.config().setReportName("Web Automation Testing");
		reporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "ABC");
		extent.setSystemInfo("O.S.", "Windows");
		extent.setSystemInfo("Tools", "Selenium Webdriver & TestNG with JDK");
		extent.setSystemInfo("Project Manager", "ABC1");
		extent.setSystemInfo("Team Lead", "ABC2");
		extent.setSystemInfo("QA", "Swapnil T");
		return extent;

	}
}
