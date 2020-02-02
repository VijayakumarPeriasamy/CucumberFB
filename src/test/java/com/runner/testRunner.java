package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue= {"com.stepdifinition"},plugin= {"pretty","json:src\\test\\resources\\reporting\\cucumber.json"},monochrome=true,dryRun=false)
public class testRunner {
	
	@AfterClass
	public void afterClass() {
		JVMReport.generateJVMReport(System.setProperty("user.dir", "src\\\\test\\\\resources\\\\reporting\\\\cucumber.json"));

	}

}
