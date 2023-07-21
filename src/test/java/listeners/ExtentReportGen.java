package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen {
	
	public static ExtentReports extent;
	public static ExtentReports extentReportGenerator() {
		
		String path = System.getProperty("user.dir")+"\\reports\\Incubyte.html";
		
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		
		reporter.config().setTheme(Theme.STANDARD);
		
		reporter.config().setReportName("Incubyte Website Testing Status");
		
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Project Name", "Incubye");
		extent.setSystemInfo("Executed by", "Mayura Kale");
		extent.setSystemInfo("Envirnment", "UAT");
		
	
		return extent;
		
	}

}
