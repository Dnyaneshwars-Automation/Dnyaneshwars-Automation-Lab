package pageObject;

import java.util.List;

import org.openqa.selenium.By;
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
	
	@FindBy(xpath="//div[@class='dataTables_scrollBody']")
	WebElement webTableDisplay;

	@FindBy(xpath="//div[@class='dataTables_scrollBody']//table//tbody//tr")
	List<WebElement> rowCount;
	
	@FindBy(xpath="//div[@class='dataTables_scrollBody']//tbody/tr[1]//td")
	List<WebElement> columnCount;
	
	@FindBy(xpath="//div[@class='dataTables_scrollBody']//tbody//tr[5]//td[4]")
	WebElement findJamesPanRole;
	
	@FindBy(xpath="//div[@class='dataTables_scrollBody']//tbody//tr[2]//td/..")
	WebElement verifyCustomerRowData;
	
	
	public void verifyCustomersWebTableDisplay () {
		webTableDisplay.isDisplayed();
	}
	
	public void findTotalNumberOfRow () {
		System.out.println(rowCount.size());
	}
	
	public void findTotalNumberOfColumn () {
		System.out.println(columnCount.size());
	}
	
	public void findCustomerRow () {
		String customerRow=verifyCustomerRowData.getText();
		System.out.println("The customer row:"+"   "+ customerRow);
	}
	
	public void findJamesPanRole () {
		String jamesRole = findJamesPanRole.getText();
		System.out.println("The role of jamesPal is:"+jamesRole);
	}
	
	public void customerTableData () {
		int tRow= rowCount.size();
		int tColumn= columnCount.size();
		for(int r=1 ;r<=tRow; r++) {
			for(int c=1; c<=tColumn; c++) {
				String data= driver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.println("The table data:"+"     "+data);
			}
		}
		
	}
	
	public void retriveIndianCricketTeamNameAndRole () {
		int tRow= rowCount.size();
		for(int r=1 ;r<=tRow; r++) {
			String companyName= driver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr["+r+"]//td[5]")).getText();
			boolean flag= false;
			if(companyName.equals("Indian Cricket Team")) {
				flag=true;
				String name=driver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr["+r+"]//td[3]")).getText();
				System.out.println("The name of customer:"+"  "+name);
				String role=driver.findElement(By.xpath("//div[@class='dataTables_scrollBody']//tbody//tr["+r+"]//td[4]")).getText();
				System.out.println("The role of customer:"+"  "+role);
			}
			else {
				flag=false;
			}
		}
		
		
	}

}
