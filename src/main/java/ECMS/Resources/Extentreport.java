package ECMS.Resources;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extentreport {
	static ExtentReports  extent;

	public static  ExtentReports  getReportObject() {


		    String path =System.getProperty("user.dir") + "\\Reports\\index.html";
			ExtentSparkReporter reporter  = new ExtentSparkReporter(path);
			reporter.config().setReportName(path);
			reporter.config().setDocumentTitle("Teamsclick");
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			extent.setSystemInfo("QA", "Ranu Tiwari");
			extent.createTest(path);
			return extent;
			}

	}


