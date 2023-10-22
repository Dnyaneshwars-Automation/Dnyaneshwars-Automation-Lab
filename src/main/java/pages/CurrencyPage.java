package pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.TakesScreenshot;

public class CurrencyPage {
	
	
WebDriver driver;

public CurrencyPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//button[@class='btn btn-link dropdown-toggle']")
private WebElement clickCurrencyBtn;

@FindBy(name="EUR")
private WebElement clickEuroCurrency;

@FindBy(name="GBP")
private WebElement clickPoundCurrency;

@FindBy(name="USD")
private WebElement clickDollarCurrency;

@FindBy(name="EUR")
private WebElement verifyEuroCurrency;

@FindBy(name="GBP")
private WebElement verifyPoundCurrency;

@FindBy(name="USD")
private WebElement verifyDollarCurrency;


public void clickcurrencybutton() {
	clickCurrencyBtn.click();
}

public void selectcurrency1() {
	clickEuroCurrency.click();
}

public void selectcurrency2() {
	clickPoundCurrency.click();
}

public void selectcurrency3() {
	clickDollarCurrency.click();
}
public void takeScreenshot(String screenshotName) throws IOException {
    try {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("Screenshots/" + screenshotName + ".png");
        FileUtils.copyFile(source, destination);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void verifycurrency1() {
	verifyEuroCurrency.isDisplayed();
	System.out.println(verifyEuroCurrency.getText());
		
}

public void verifycurrency2() {
	verifyPoundCurrency.getText();
}

public void verifycurrency3() {
	verifyDollarCurrency.getText();
}


}
