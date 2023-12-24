//package stepdefination;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.WebDriver;
//
//import factory.DriverFactory;
//import io.cucumber.java.After;
//import io.cucumber.java.Before;
//
//public class BaseClass {
//	
//	
//	public static WebDriver driver;
//	
//	@Before 
//	public void setUpBrowser() {
//		DriverFactory.initializebrowser("chrome");
//		driver=DriverFactory.getDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://admin-demo.nopcommerce.com/login");
//	}
//	
//	@After
//	public void tearDown() {
//		driver.close();
//	}
//
//}
