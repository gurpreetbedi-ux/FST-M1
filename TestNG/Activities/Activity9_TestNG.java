import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity9_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }
    @Test
    public void handleAlert() {
        driver.findElement(By.id("simple")).click();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println("Alert text: " + alertText);
        alert.accept();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}