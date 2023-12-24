//package hook;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import factory.DriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//import pages.CurrencyPage;
//
//import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//
//public class MyHooks {
//	
//	WebDriver driver;
//	
//	
//	@Before
//	public void setup() throws InterruptedException, IOException {
//		
////		ConfigReader.initializeProperties(); // Initialize properties
////	    String browser = ConfigReader.getProperty("browser");
////	    String url = ConfigReader.getProperty("url");
//	    
//	    
//		DriverFactory.initializebrowser("chrome");
//		driver= DriverFactory.getDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.get("https://tutorialsninja.com/demo/");
//	}
//	
//	 public void scrollToElement(WebElement element) {
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("arguments[0].scrollIntoView();", element);
//	    }
//	
//	 public void scrollByPixels(int pixels) {
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//	        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
//	    }
//	 
//	 
//
//
//	
//	
//	@After
//	public void teardown() {
//		driver.quit();
//	}
//
//}
