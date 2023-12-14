package stepdefination;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;


public class BuyProductStep extends BaseClass {

	
	@Before
	public void setupAppium () throws MalformedURLException{
	        // Set up desired capabilities
	        DesiredCapabilities cap = new DesiredCapabilities();
	        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Emulator-5455");
	        cap.setCapability(MobileCapabilityType.APP, "app.apk");
	        driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    }

	   @After 
	   public void tearDown() {
		   driver.close();
		   
	   }
	   
	   @Given("user navigate on home screen")
	   public void user_navigate_on_home_screen() {
	      System.out.println("User land on home page");
	   }

	   private String getTestData(String sheetName, int rowNum, int colNum) throws IOException {
	        String filePath = "C:\\Users\\monal\\git\\Dnyaneshwar-Automation-Android\\QA_Automation_AndroidApplication\\ExcelSheet\\";
	        FileInputStream fis = new FileInputStream(filePath);
	        Workbook workbook = WorkbookFactory.create(fis);
	        Sheet sheet = workbook.getSheet(sheetName);
	        Row row = sheet.getRow(rowNum);
	        Cell cell = row.getCell(colNum);
	        String cellValue = cell.toString();
	        workbook.close();
	        fis.close();
	        return cellValue;
	    }
	   
	   @When("click on search and enter data from Excel sheet {string} {int} {int}")
	   public void click_on_search_and_enter_data_from_Excel_sheet(String sheetName, int rowNum, int colNum) throws IOException {
	       String product = getTestData(sheetName, rowNum, colNum);
	       homepage.click_on_search_and_enter(product);
	   }
	 

	   @And("Click on our product")
	   public void click_on_our_product() {
		   homepage.click_on_our_product();
	   }

	   @When("click on Buy Now button")
	   public void click_on_buy_now_button() {
	      productpage.click_on_buy_now_button();
	   }

	   @When("select address and click on Continue button")
	   public void select_address_and_click_on_continue_button() {
	      paymentpage.select_address_and_click_on_continue_button();
	   }

	   @When("select payment method and click on Continue button")
	   public void select_payment_method_and_click_on_continue_button() {
		   paymentpage.select_payment_method_and_click_on_continue_button();
	   }
	   
	   @Then("click on Place Your Order and Pay buuton")
	   public void click_on_place_your_order_and_pay_buuton() {
	       confirmationpage.click_on_place_your_order_and_pay_buuton();
	   }

	  

	   
	}


