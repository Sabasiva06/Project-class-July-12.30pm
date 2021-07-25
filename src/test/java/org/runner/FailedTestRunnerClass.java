package org.runner;

import org.base.JVMReportingClass;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "@target\\rerun.txt" }, glue = {
		"org.step" }, dryRun = false, monochrome = true, plugin = { "pretty", "html:D:\\Cucumber11.30amBatch\\target",
				"json:D:\\Cucumber11.30amBatch\\target\\sample.json",
				"junit:D:\\Cucumber11.30amBatch\\target\\sample.xml",
				"rerun:D:\\Cucumber11.30amBatch\\target\\rerun.txt" }, snippets = SnippetType.CAMELCASE, tags = {
						"~@reg", "~@sanity" })

public class FailedTestRunnerClass {
	@AfterClass
	public static void afterClass() {
		JVMReportingClass.jvmReporter("D:\\\\Cucumber11.30amBatch\\\\target\\\\sample.json");

	}
}
