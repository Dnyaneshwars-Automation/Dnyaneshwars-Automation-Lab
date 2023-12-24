package stepdefination;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public AppiumDriver<MobileElement> driver;

    public void setUpAppium() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "1601046539002KX");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13");
        capabilities.setCapability("appPackage", "com.flipkart.android");
        capabilities.setCapability("appActivity", "com.flipkart.android.activity.HomeFragmentHolderActivity");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

        // Initialize the Appium driver
        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        System.out.println("Application Launch....");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Accept PopUp
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        System.out.println("Successfully Navigate on Home Screen.....");
        driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.flipkart.android:id/iv_checkbox\"])[4]")).click(); 
        driver.findElement(By.xpath("//android.widget.Button[@resource-id=\"com.flipkart.android:id/select_btn\"]")).click();
        //System.out.println("Successfully Navigate on Home Screen.....");
        driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"097664 03282\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]")).click();
        System.out.println("Login with Phone Number");
        driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.flipkart.android:id/button\"]")).click();
        Thread.sleep(10000);
      //  driver.findElement(By.xpath("//android.widget.ImageView[@resource-id=\"com.flipkart.android:id/custom_back_icon\"]")).click();
    }

    public void tearDownAppium() {
        System.out.println("Application Closed....");
        driver.quit();
    }
}
