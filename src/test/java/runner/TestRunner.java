package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features="src/test/resources/Features",
		glue={"stepdefination, hook"},
		tags= ("@"),
		plugin= {"pretty", "html:target/cucumber-reports.", 
				"com.aventstuck.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class TestRunner {

}
