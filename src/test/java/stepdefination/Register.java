package stepdefination;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.RegisterPage;

public class Register {
	
	WebDriver driver;
	RegisterPage registerpage;
	HomePage homepage;
	
	
	
	@Given("user navigate to register page")
	public void user_navigate_to_register_page() throws InterruptedException {
		
		driver= DriverFactory.getDriver();
		
		homepage=new HomePage(driver);
		homepage.clickonAccountButton();
		
	}

	@When("user click on register button and navigates to register form")
	public void user_click_on_register_button_and_navigates_to_register_form() throws InterruptedException {
		homepage.clickOnRegisterButton();
	}
	
//	@When("user enter the information in below required field using asMaps")
//	public void user_enter_the_information_in_below_required_field_using_as_maps(DataTable dataTable) throws InterruptedException {
//	//	List<Map<String, String>> datatable=dataTable.asMaps(String.class, String.class);
//		   for(Map<String, String> datamap:datatable) {
//			   driver= DriverFactory.getDriver();
//			   registerpage=new RegisterPage(driver);
//			   registerpage.enterFirstName(datamap.get("firstname"));
//			   registerpage.enterLastName(datamap.get("lastname"));
//			   registerpage.enterEmail(datamap.get("email"));
//			   registerpage.enterTelephone(datamap.get("telephone"));
//			   registerpage.enterPassword(datamap.get("password"));
//			   //registerpage.enterConfirmPassword(datamap.get("password"));
//		   }
//	}

//	@When("user enter the information in below required field using asLists")
//	public void user_enter_the_information_in_below_required_field_using_as_lists(DataTable dataTable) throws InterruptedException {
//	   List<List<String>> dataList=dataTable.asLists(String.class);
//	   
//	   for(List<String> dataL: dataList) {
//		   driver= DriverFactory.getDriver();
//		   registerpage=new RegisterPage(driver);
//		   registerpage.enterFirstName(dataL.get(0));
//		   registerpage.enterLastName(dataL.get(1));
//		   registerpage.enterEmail(dataL.get(2));
//		   registerpage.enterTelephone(dataL.get(3));
//		   registerpage.enterPassword(dataL.get(4));
//		   registerpage.enterConfirmPassword(dataL.get(5));
//		   
//	   }
//
}
