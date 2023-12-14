package stepdefination;

import org.openqa.selenium.WebDriver;

import pageObject.HomePage;
import pageObject.PaymentPage;
import pageObject.ProductPage;
import pageObject.ConfirmationPage;



public class BaseClass {

	public static WebDriver driver;
	
	HomePage homepage;
	ProductPage productpage;
	PaymentPage paymentpage;
	ConfirmationPage confirmationpage;
		}

