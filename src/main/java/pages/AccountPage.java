package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {

WebDriver driver;
	
	public AccountPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Edit Account")
	private WebElement clickOnEditAccount;
	
	@FindBy(xpath="//div[@class='col-sm-9']")
	private WebElement verifyPersonalAccountDetails;
	
	@FindBy(linkText="Privacy Policy")
	private WebElement clickOnPrivacyPolicy;
	
	@FindBy(id="content")
	private WebElement verifyPricacyPolicy;
	
	

	public void clickOnEditAccountBtn() throws InterruptedException {
		clickOnEditAccount.click();
		Thread.sleep(2000);
	}
	
	public void verifyPersonalAccountDetailsText() throws InterruptedException {
		verifyPersonalAccountDetails.isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(2000);
	}
	
	public void scrollDown(int pixels) {
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();", clickOnPrivacyPolicy);
	    js.executeScript("window.scrollBy(0, arguments[1]);", 0, pixels);
	}

	public void clickOnPrivacyPolicyBtn() throws InterruptedException {
//		JavascriptExecutor js= (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1000)", "");
//		Thread.sleep(5000);
		clickOnPrivacyPolicy.click();
		Thread.sleep(2000);
	}
	
	public void verifyPrivacyPolicyText() throws InterruptedException {
		verifyPricacyPolicy.isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(2000);
	}
	
}
