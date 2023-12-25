package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=true,
		monochrome=true,
		features="src/test/resources/Features",
		glue={"stepdefination"},
		tags= ("@SanityTestAutomation_SearchCustomer"),
		plugin= {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}
		)


public class TestRunner {

}
