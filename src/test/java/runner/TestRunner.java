package runner;

//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features="src/test/resources/Features",
		glue={"stepdefination","hooks"},
		tags= ("@SanityTestAutomation_Login"),
		plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)
// "html:target/cucumber-reports.html", "json:target/cucumber-reports.json",

public class TestRunner {
// extends AbstractTestNGCucumberTests
	
//	<!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
//
//		<dependency>
//
	
//			<groupId>io.cucumber</groupId>
//			<artifactId>cucumber-junit</artifactId>
//			<version>7.13.0</version>
//
//		</dependency>

}
