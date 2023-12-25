package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomerPage {
	
	public WebDriver driver;
	
	public SearchCustomerPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='dataTables_wrapper dt-bootstrap4 no-footer']")
	WebElement webTableDisplay;
	
	@FindBy(id="search-customers")
	WebElement serchButton;
	
	@FindBy(xpath="//div[@class='dataTables_wrapper dt-bootstrap4 no-footer']//tbody//tr")
	List<WebElement> rowCount;
	
	@FindBy(xpath="//div[@class='dataTables_wrapper dt-bootstrap4 no-footer']//tbody//tr[1]//td")
	List<WebElement> columnCount;
	
	

}
