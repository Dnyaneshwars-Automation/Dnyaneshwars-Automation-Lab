package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features={"src/test/resources/Features"},
		glue= {"stepdefination"},
		tags=("@tag1"),
		plugin= {"pretty", "html:reports/Cucumber-Reports/Reports.html","json:reports/Cucumber-Reports/Reports.json",}
		)


public class JunitTestRunner {

}
