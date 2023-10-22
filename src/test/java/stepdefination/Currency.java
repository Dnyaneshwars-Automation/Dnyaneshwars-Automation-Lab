package stepdefination;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CurrencyPage;

public class Currency {
	
	private WebDriver driver;
	
	CurrencyPage currencypage;
	
	
	@When("click on Currency button and select Euro")
	public void click_on_currency_button_and_select_euro() throws IOException {
	    driver=DriverFactory.getDriver();
	    currencypage= new CurrencyPage(driver);
	    
	    currencypage.clickcurrencybutton();
	    currencypage.selectcurrency1();
	    currencypage.takeScreenshot("Euro Currency");
	}

	@Then("Verify Euro Currency")
	public void verify_euro_currency() {
		currencypage.verifycurrency1();
	}

	@When("click on Currency button and select Pound Sterling")
	public void click_on_currency_button_and_select_pound_sterling() throws IOException {
		driver=DriverFactory.getDriver();
	    currencypage= new CurrencyPage(driver);
	    
		currencypage.clickcurrencybutton();
		currencypage.selectcurrency2();
		currencypage.takeScreenshot("Pound Sterling Currency");
	}

	@Then("Verify Pound Sterling Currency")
	public void verify_pound_sterling_currency() throws IOException {
		currencypage.verifycurrency2();
	}

	@When("click on Currency button and select Dollar")
	public void click_on_currency_button_and_select_dollar() throws IOException {
		driver=DriverFactory.getDriver();
	    currencypage= new CurrencyPage(driver);
	    
		currencypage.clickcurrencybutton();
		currencypage.selectcurrency3();
		currencypage.takeScreenshot("Dollar Currency");
	}

	@Then("Verify Dollar Currency")
	public void verify_dollar_currency() {
		currencypage.verifycurrency3();
	}

}


