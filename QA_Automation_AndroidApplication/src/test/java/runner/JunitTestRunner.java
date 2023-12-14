package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		dryRun=false,
		monochrome=true,
		features={"src/test/resources/featurefolder"},
		glue= {"stepdefination"},
		tags=("@login"),
		plugin= {"pretty", "html:reports/Cucumber-Reports/Reports.html","json:reports/Cucumber-Reports/Reports.json",}
		)


public class JunitTestRunner {

}
