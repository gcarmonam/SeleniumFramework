package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ReportManager {

    private static ExtentReports extentReports;

    public static ExtentReports getInstance(){
        if(extentReports == null){
            createInstance("reports/spark.html");
        }
        return extentReports;
    }

    public static void createInstance(String fileName) {
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(fileName);
        sparkReporter.config().setTheme(Theme.DARK);
        sparkReporter.config().setDocumentTitle("QA Automation Report");
        sparkReporter.config().setReportName("Excecution Reports");

        extentReports = new ExtentReports();
        extentReports.attachReporter(sparkReporter);
        extentReports.setSystemInfo("Tester","Gabriel Carmona");
        extentReports.setSystemInfo("Environment","QA");
    }

}
