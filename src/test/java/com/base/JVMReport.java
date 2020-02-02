package com.base;

import java.awt.List;
import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static void generateJVMReport(String jsonfile) {
		File loc =new File(System.getProperty("user.dir")+"\\src\\test\\resources\\reporting");
		Configuration con =new Configuration(loc, "aircanada");
		con.addClassifications("Browser", "Chrome");
		con.addClassifications("sprint", "10");
		con.addClassifications("os", "10");
		ArrayList<String> jsonfile1=new ArrayList<String>();
		jsonfile1.add(jsonfile);
		ReportBuilder builder=new ReportBuilder(jsonfile1, con);
		builder.generateReports();
		
	}

}
