package stepdefination;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination extends BaseClass {
	
	@Given("user launch application")
	public void user_launch_application() throws MalformedURLException, InterruptedException {
	    setUpAppium();
	}

	@When("navigate on home screen")
	public void navigate_on_home_screen() throws InterruptedException {
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout"))));
		 driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout")).isDisplayed(); 	 
		 System.out.println("home screen display");
		 Thread.sleep(10000);
	}

	@Then("close the application")
	public void close_the_application() {
	  System.out.println("close application");
	  tearDownAppium();
	}


}
