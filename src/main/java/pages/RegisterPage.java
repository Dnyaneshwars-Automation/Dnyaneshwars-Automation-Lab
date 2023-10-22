package pages;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class RegisterPage {
	
	WebDriver driver;
	
	public RegisterPage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="input-firstname")
	private WebElement enterFirstName;
	
	@FindBy(id="input-lastname")
	private WebElement enterLastName;
	
	@FindBy(name="email")
	private WebElement enterEmail;
	
	@FindBy(name="telephone")
	private WebElement enterTelephone;
	
	@FindBy(name="password")
	private WebElement enterPassword;
	
	@FindBy(name="confirm")
	private WebElement enterConfirmPassword;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement selectPrivacyPolicy;
	
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement clickRegisterAfter;
	
	@FindBy(xpath="//div[@class='alert alert-danger alert-dismissible']")
	private WebElement verifySuccRegisterMsg;
	
	

	
	
	public void enterFirstName (String firstname) throws InterruptedException {
		enterFirstName.sendKeys(firstname);
		Thread.sleep(2000);
	}
	
	public void enterLastName (String lastname) throws InterruptedException {
		enterLastName.sendKeys(lastname);
		Thread.sleep(2000);
	}
	
	public void enterEmail (String email) throws InterruptedException {
		enterEmail.sendKeys(email);
		Thread.sleep(2000);
	}
	
	public void enterTelephone (String telephone) throws InterruptedException {
		enterTelephone.sendKeys(telephone);
		Thread.sleep(2000);
	}
	
	public void enterPassword (String password) throws InterruptedException {
		enterPassword.sendKeys(password);
		Thread.sleep(2000);
		enterConfirmPassword.sendKeys(password);
		Thread.sleep(2000);
	}
	
	public void selectPrivacyPolicy () throws InterruptedException {
		//selectPrivacyPolicy.isSelected();
		selectPrivacyPolicy.click();
		Thread.sleep(2000);
	}
	
	public void clickOnRegisterButtonAfter () throws InterruptedException {
		
		clickRegisterAfter.click();
		Thread.sleep(3000);
	}
	
	public void verifySuccessfulRegister () throws InterruptedException {
		verifySuccRegisterMsg.isDisplayed();
		Assert.assertTrue(true);
		Thread.sleep(3000);
	}
	
	
	
	
}

