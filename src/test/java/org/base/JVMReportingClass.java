package org.base;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReportingClass {

	public static void jvmReporter(String json) {

		File file = new File("D:\\Cucumber11.30amBatch\\target");
		Configuration configuration = new Configuration(file, "ProjectClass9AMBatch");
		configuration.addClassifications("Browser-Type", "Chrome");
		configuration.addClassifications("Platform", "Win-10");
		configuration.addClassifications("Sprint No", "22");
		configuration.addClassifications("Environment", "QA");

		List<String> li = new ArrayList<String>();
		li.add(json);

		ReportBuilder builder = new ReportBuilder(li, configuration);
		builder.generateReports();

	}

}
