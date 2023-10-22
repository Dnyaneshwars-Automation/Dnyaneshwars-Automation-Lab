package stepdefination;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class Home {
	
	WebDriver driver;
	HomePage homepage;
	
	
	@Given("user navigate to Home page")
	public void user_navigate_to_home_page() {
	   driver=DriverFactory.getDriver();
	   homepage=new HomePage(driver);
	   
	   System.out.println("navigate on home page");
	}

	@When("user click on MP3 Player and select test {int}\\({int})")
	public void user_click_on_mp3_player_and_select_test(Integer int1, Integer int2) throws InterruptedException {
		driver=DriverFactory.getDriver();
		   homepage=new HomePage(driver);
		homepage.selectDropDown();
		Thread.sleep(5000);
	}

	@And("click on test {int}\\({int})")
	public void click_on_test(Integer int1, Integer int2) {
	    System.out.println("select");
	}

	@Then("verify user selecy or not")
	public void verify_user_selecy_or_not() {
	    homepage.verifyMP3Player();
	    
	    System.out.println("Validate Successfully");
	}

}
