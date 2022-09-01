package com.bdd.base;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import com.api.reporting.ReportFactory;

public class BDD_BaseClass {
	
	@BeforeClass
	public static void setup() {
		ReportFactory.StartReport("TestExtent");
		ReportFactory.setCucumberReports();
	}
	
	@AfterClass
	public static void tearDown() {
		//ReportFactory.PrintAllTestCases();
		ReportFactory.EndReport();
		ReportFactory.saveCucumberReports();
		ReportFactory.UploadReportToFileIO();
		ReportFactory.PublishReportOnSlack();
	}
	
}
