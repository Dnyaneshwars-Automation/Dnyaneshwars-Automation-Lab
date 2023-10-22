package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverFactory {
	
	 static WebDriver driver=null;
	
	public static void initializebrowser(String browserName) {
		
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("edge")) {
		WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			
		}
		
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			 
		}
		
	}
		
		public static WebDriver getDriver() {
		
		return driver;
	}

}
