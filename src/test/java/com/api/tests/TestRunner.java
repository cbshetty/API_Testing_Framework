package com.api.tests;

import com.api.reporting.ReportFactory;
import com.bdd.base.BDD_BaseClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/AMX_Features/"},
glue={"stepdefs"},
monochrome=true,
plugin =
{
		"pretty" , 
		"json:target/cucumber.json",
		"html:target/cucumber"/*,
		"com.api.reporting.TestCaseListener",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"*/
},
dryRun=true,
tags = "@SmartAPI"
		)
public class TestRunner extends BDD_BaseClass{
	@BeforeClass
	public static void Setup_SlackIntegration() {
		/*if(System.getProperty("channelID")!=null) {
			AMX_API_Constants.AMXSlack_ChannelID=System.getProperty("channelID");
		}
		String TestName="Test Execution Summary";
		if(System.getProperty("TestName")!=null) {
			TestName = System.getProperty("TestName");
		}
		if(System.getProperty("EnvURL")!=null) {
			ReportFactory.SetSlackDetails(AMX_API_Constants.AMXSlack_ChannelID, TestName, System.getProperty("EnvURL"));
		}else {
			ReportFactory.SetSlackDetails(AMX_API_Constants.AMXSlack_ChannelID, TestName, AMX_API_Constants.AMX_BaseURI);
		}*/
	}
}
