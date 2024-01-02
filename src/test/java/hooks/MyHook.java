package hooks;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyHook {

	public static WebDriver driver;
	
	@Before 
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monal\\Downloads\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		options.setBinary("C:\\Users\\monal\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
		DriverFactory.initializebrowser("chrome", options);
		driver=DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	public void explicitlyWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
