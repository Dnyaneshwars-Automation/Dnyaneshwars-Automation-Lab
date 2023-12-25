package stepdefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
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
	
	// Add New Customers 
	
	@When("click on customers hidden button")
	public void click_on_customers_hidden_button() {
		WebElement customersBtnlink=driver.findElement(By.xpath("//a[@href='#']//p[contains(text(),'Customers')]"));
		customersBtnlink.click();
	}

	@When("click on customers option")
	public void click_on_customers_option() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")));
		driver.findElement(By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]")).click();
	}

	@When("click on Add New button")
	
	public void click_on_add_new_button() {
		WebElement addNewBtnLink=driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		String url2=addNewBtnLink.getAttribute("href");
		System.out.println(url2);
		addNewBtnLink.click();
	}

	@When("enter customers information")
	public void enter_customers_information() throws InterruptedException {
		String rsValue=RandomStringUtils.randomAlphabetic(6);
		String pass=rsValue;
		String gmail=rsValue+"@gmail.com";
		driver.findElement(By.id("Email")).sendKeys(gmail);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.id("FirstName")).sendKeys("vishal");
		driver.findElement(By.id("LastName")).sendKeys("patil");
		driver.findElement(By.id("Gender_Male")).click();
		driver.findElement(By.xpath("//input[@name='DateOfBirth']")).sendKeys("01/01/1995");
		driver.findElement(By.xpath("//input[@name='Company']")).sendKeys("Test Pvt Ltd");
		
		//List of elements
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@class='check-box']"));
		System.out.println(checkBox.size());
		checkBox.get(0).isSelected();
		
		//List of elements
		//WebElement newsLatter=driver.findElement(By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover']"));
		
		driver.findElement(By.xpath("//input[@id='IsTaxExempt']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='k-widget k-multiselect k-multiselect-clearable'])[1]")).click();
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Test store 2')]")));
		driver.findElement(By.xpath("//li[contains(text(),'Test store 2')]")).click();
		
		//div[@class='k-widget k-multiselect k-multiselect-clearable']
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class='k-widget k-multiselect k-multiselect-clearable']")).click();
		WebDriverWait wait1 = new WebDriverWait(driver, 30);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(text(),'Administrators')]")));
		driver.findElement(By.xpath("//li[contains(text(),'Administrators')]")).click();
//		List<WebElement> txtBox=driver.findElements(By.xpath("//li[@class='k-item']"));
//		System.out.println(txtBox.size());
//		txtBox.get(0).click();
//		txtBox.get(4).click();
		
//		driver.findElement(By.xpath("//select[@class='form-control valid']")).click();
//		WebDriverWait wait11 = new WebDriverWait(driver, 30);
//		wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@class='form-control valid']//option[contains(text(),'Vendor 1')]")));
//		driver.findElement(By.xpath("//select[@class='form-control valid']//option[contains(text(),'Vendor 1')]")).click();
		
		driver.findElement(By.id("Active")).isSelected();
		
		driver.findElement(By.id("AdminComment")).sendKeys("New Customer Added in This Store....");
		
		Thread.sleep(10000);
	}

	@When("click on save button")
	public void click_on_save_button() {
		driver.findElement(By.name("save")).click();
	}

	@Then("verify new customer added successfully")
	public void verify_new_customer_added_successfully() {
	String aMsgTxt=	driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();
	String eMsgTxt="The new customer has been added successfully.";
	
	if(aMsgTxt.equalsIgnoreCase(eMsgTxt)) {
		Assert.assertTrue(true);
		System.out.println("Customer added successfully ....");
	}
	else {
		Assert.assertFalse(false);
		System.out.println("Customer not added successfully ....");
	}
		
	}


}
