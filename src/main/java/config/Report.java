package config;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import io.cucumber.java.Scenario;

public class Report {

    private static ExtentReports extentReports;
    private static ExtentTest test;

    public static void initializeReport(){
        ExtentSparkReporter spark = new ExtentSparkReporter("report.html");
        spark.config().setDocumentTitle("Report Title");
        spark.config().setReportName("Report Name");

        extentReports = new ExtentReports();
        extentReports.attachReporter(spark);
    }

    public static void startTest(Scenario scenario){
        test = extentReports.createTest(scenario.getName());
    }

    public static void logStatus(Scenario scenario){
        if (scenario.isFailed()){
            test.fail(scenario.getName());
        } else {
            test.pass(scenario.getName());
        }
    }

    public static void generateReport(){
        extentReports.flush();
    }
}
