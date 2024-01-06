package hooks;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import org.openqa.selenium.support.ui.WebDriverWait;

public class MyHook {

	public static WebDriver driver;
	
	private static Logger logger = LogManager.getLogger(MyHook.class);
	
	@Before 
	public void setUpBrowser() {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monal\\Downloads\\chromedriver-win64\\chromedriver.exe"); 
//		ChromeOptions options=new ChromeOptions();
//		options.setBinary("C:\\Users\\monal\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		DriverFactory.initializebrowser("chrome");
		driver=DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		logger.info("Browser SetUp Successfully");
	}
	
	@After
	public void tearDown(Scenario scenario) {
		if (driver != null) {
		if(scenario.isFailed()==true) {
			try {
			final byte[] screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
			}
			catch(Exception e) {
				 e.printStackTrace();
			}
		}
		
		}
		driver.close();
		logger.info("Browser Teardown Successfully");
	}
	
	
	

	public void explicitlyWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
