package stepdefination;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Login {
	
	public static WebDriver driver;
	
	@Before 
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monal\\Downloads\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
		//options.setBinary("C:\\Users\\monal\\Downloads\\chrome-win64\\chrome.exe");
		DriverFactory.initializebrowser("chrome", options);
		driver=DriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		driver.get("https://admin-demo.nopcommerce.com/login");
	}

	@When("user enterd {string} and {string}")
	public void user_enterd_and(String email, String password) {
		driver.findElement(By.name("Email")).clear();
	   driver.findElement(By.name("Email")).sendKeys(email);
	   driver.findElement(By.id("Password")).clear();
	   driver.findElement(By.id("Password")).sendKeys(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	   driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();
	}

	@Then("user validate title of homepage")
	public void user_validate_title_of_homepage() {
	  System.out.println(driver.getTitle());
	  System.out.println("Navigate on home page....");
	   
	}

	@Then("user validate error message with invalid password")
	public void user_validate_error_message_with_invalid_password() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='message-error validation-summary-errors']")));
	  String actualMsg= driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
	  String expectedMsg="Login was unsuccessful. Please correct the errors and try again.";
	if(actualMsg.equals(expectedMsg)) {
		Assert.assertTrue(true);
		System.out.println("Valid error msg....");
	}
	else {
		Assert.assertFalse(false);
		System.out.println("Invalid error mag....");
	}
	}

}
