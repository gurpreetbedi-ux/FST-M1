import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity6_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @Test
    public void loginTest() {
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Login message: " + message);
        Assert.assertEquals(message, "Welcome Back, admin");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}