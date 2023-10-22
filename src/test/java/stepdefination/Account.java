package stepdefination;


import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;

public class Account {
	
	private WebDriver driver;
	
	private AccountPage accountpage;
	
	@When("click on Edit Account button")
	public void click_on_edit_account_button() throws InterruptedException {
		driver=DriverFactory.getDriver();
		accountpage=new AccountPage(driver);
		
		accountpage.clickOnEditAccountBtn();
	}

	@Then("Verify personal account information text")
	public void verify_personal_account_information_text() throws InterruptedException {
		accountpage.verifyPersonalAccountDetailsText();
	}
	
	@When("click on privacy policy link")
	public void click_on_privacy_policy_link() throws InterruptedException {
		driver=DriverFactory.getDriver();
		accountpage=new AccountPage(driver);
		accountpage.scrollDown(500);
		accountpage.clickOnPrivacyPolicyBtn();
	}

	@Then("Verify privacy policy link")
	public void verify_privacy_policy_link() throws InterruptedException {
		accountpage.verifyPrivacyPolicyText();
	}
	    
	    
	}
