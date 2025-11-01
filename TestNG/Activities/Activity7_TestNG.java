import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Activity7_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/login-form");
    }
    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {
                {"admin", "password"},
                {"user", "pass"}
        };
    }
    @Test(dataProvider = "Authentication")
    public void loginTest(String username, String password) {
        driver.findElement(By.id("username")).clear();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String message = driver.findElement(By.id("action-confirmation")).getText();
        System.out.println("Message for " + username + ": " + message);
        if (username.equals("admin")) {
            Assert.assertTrue(message.contains("Welcome Back"));
        } else {
            Assert.assertTrue(message.contains("Invalid Credentials"));
        }
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}