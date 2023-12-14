package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class PaymentPage {

	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement selectAddressRadioBtn;
	
	@FindBy(xpath="")
	WebElement continueBtn;
	
	@FindBy(xpath="")
	WebElement selectPaymentRadioBtn;
	
	public PaymentPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void select_address_and_click_on_continue_button() {
		selectAddressRadioBtn.isSelected();
		continueBtn.click();
	}
	
	public void select_payment_method_and_click_on_continue_button() {
		selectPaymentRadioBtn.isSelected();
		continueBtn.click();
	}
	
	
}
