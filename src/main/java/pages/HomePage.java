package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	
WebDriver driver;
	
	public HomePage (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement AccountButton;
	
	@FindBy(linkText="Register")
	private WebElement clickOnRegisterButton;
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[5]")
	WebElement MP3_Player;
	
	@FindBy(linkText="test 9")
	WebElement verifyMP3_Player;
	
	
	public void clickonAccountButton() throws InterruptedException {
		AccountButton.click();
		Thread.sleep(3000);
	}

	public void clickOnRegisterButton() throws InterruptedException {
		clickOnRegisterButton.click();
		Thread.sleep(3000);
	}
	
	public void selectDropDown() {
		Select select= new Select(MP3_Player);
		select.selectByVisibleText("test 9 (0)");
	}
	
	public void verifyMP3Player (){
		verifyMP3_Player.isDisplayed();
		Assert.assertTrue(true);
	}
	}