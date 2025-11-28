package activities;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class firsttest  {


	AppiumDriver driver;
	WebDriverWait wait;
	
	@BeforeClass 
	public void setUp() throws MalformedURLException, URISyntaxException{
		
	
		UiAutomator2Options caps = new UiAutomator2Options();
		caps.setPlatformName("andrioid");
		caps.setAutomationName("UiAutomator2");
		caps.setApp("path/To/app.apl");
		caps.noReset();
		
		URL serverURL= new URI("http://localhost:4723").toURL();
		driver = new AndroidDriver(serverURL, caps);
		
	}

	@Test
	public void testMethod() {
		}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}