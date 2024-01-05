package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//import org.junit.runner.RunWith;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features="src/test/resources/Features",
		glue={"stepdefination","hooks"},
		tags= ("@SanityTestAutomation_Login"),
		plugin= {"pretty", "html:target/cucumber-reports.html", "json:target/cucumber-reports.json"}
		)


public class TestRunner extends AbstractTestNGCucumberTests {

}
