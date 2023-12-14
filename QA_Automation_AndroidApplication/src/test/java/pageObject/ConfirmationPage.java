package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class ConfirmationPage {
	
	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement confirmationMsg;
	
	public ConfirmationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_on_place_your_order_and_pay_buuton() {
		confirmationMsg.isDisplayed();
		String actual=confirmationMsg.getText();
		String expected="Orderd Placed Successfully";
		Assert.assertEquals(actual, expected);
	}
	
	 

}
