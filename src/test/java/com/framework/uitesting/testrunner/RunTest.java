package com.framework.uitesting.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/cucumber/features/" }, glue = {
		"com.framework.uitesting.stepdefinitions" },dryRun=true, tags = { "@TitleVal" }, plugin = { "html:target/cucumber-reports" })
public class RunTest {

}
