package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	
	@FindBy(xpath="")
	WebElement searchBox;
	
	@FindBy(xpath="")
	WebElement clickSearchBtn;
	
	@FindBy(xpath="")
	WebElement selectProduct;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void click_on_search_and_enter(String Product) {
		searchBox.sendKeys(Product);
		
		clickSearchBtn.click();
	}
	
	public void click_on_our_product() {
		selectProduct.click();
	}
	
	
	
	

}
