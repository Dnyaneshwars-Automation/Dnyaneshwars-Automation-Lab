//package stepdefination;
//
//import org.openqa.selenium.WebDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Then;
//import pageObject.CustomersOrderPage;
//
//public class Sales {
//	
//	public WebDriver driver;
//	
//	CustomersOrderPage customerorderpage;
//	
//	@And("click on sales hidden button")
//	public void click_on_sales_hidden_button() {
//		customerorderpage=new 	CustomersOrderPage(driver);
//		customerorderpage.clickOnSalesButton();
//	}
//
//	@And("click on order option")
//	public void click_on_order_option() {
//		customerorderpage.clickOnSalesOrderButton();
//	}
//
//	@Then("verify the required date selected")
//	public void verify_the_required_date_selected() {
//		customerorderpage.clickOnStartDataCalenderandSelectStartDate();
//	}
//
//}
