package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;
import pageObject.AddNewCustomer;
import pageObject.HomePage;

public class Login {
	
	public static WebDriver driver;
       LoginPage loginpage;
       HomePage homepage;
       AddNewCustomer addnewcustomer;

	
	@Before 
	public void setUpBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\monal\\Downloads\\chromedriver-win64\\chromedriver.exe"); 
		ChromeOptions options=new ChromeOptions();
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
	
	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		
	}

	@When("user enterd {string} and {string}")
	public void user_enterd_and(String email, String password) {
		loginpage=new LoginPage(driver);
		loginpage.enterEmail(email);
		loginpage.enterPassword(password);
	}

	@And("click on login button")
	public void click_on_login_button() {
	   loginpage.clickOnLoginButton();
	}

	@Then("user validate title of homepage")
	public void user_validate_title_of_homepage() {
		homepage=new HomePage(driver);
		homepage.verifyHomePageTitle();
	}

	@Then("user validate error message with invalid password")
	public void user_validate_error_message_with_invalid_password() {
		loginpage.verifyLoginErrorMessage();
	}
	
	// Add New Customers 
	
	@When("click on customers hidden button")
	public void click_on_customers_hidden_button() {
		addnewcustomer= new AddNewCustomer(driver);
		addnewcustomer.clickOnCustomersDropDown();
	}

	@When("click on customers option")
	public void click_on_customers_option() {
		addnewcustomer.clickOnCustomersOption();
	}

	@When("click on Add New button")
	public void click_on_add_new_button() {
		addnewcustomer.clickOnAddNewButton();
	}

	@When("enter customers information")
	public void enter_customers_information() throws InterruptedException {
		addnewcustomer.enterAddNewCustomersDetails();
	}

	@When("click on save button")
	public void click_on_save_button() {
		addnewcustomer.clickOnSaveButton();
	}

	@Then("verify new customer added successfully")
	public void verify_new_customer_added_successfully() {
		addnewcustomer.verifyNewCustomerAddedSuccessfully();
	}
	
	// Search Customer By Name
	
	@Then("customers webtable is display")
	public void customers_webtable_is_display() {
	  
	}

	@Then("find the number of table row")
	public void find_the_number_of_table_row() {
	   
	}

	@Then("find the number of table column")
	public void find_the_number_of_table_column() {
	   
	}

	@Then("find the virat kohali customer by name")
	public void find_the_virat_kohali_customer_by_name() {
	   
	}

	@Then("retrive the all table data")
	public void retrive_the_all_table_data() {
	   
	}

	@Then("retrive the indian cricket team customer name and customer role from table")
	public void retrive_the_indian_cricket_team_customer_name_and_customer_role_from_table() {
	   
	}


}
