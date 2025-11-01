import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;
public class Activity3_TestNG {
    WebDriver driver;
    WebDriverWait wait;
    
    private final String USERNAME = "testuser";
    private final String PASSWORD = "testpassword";
   
    private final String LOGIN_URL = "https://example.com/login";
    @BeforeClass
    public void setUp() {
   
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
       
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        driver.get(LOGIN_URL);
    }
    @Test
    public void loginAndReadMessage() {
     
        WebElement usernameField = null;
        try {
            usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        } catch (Exception e) {
           
            usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        }
       
        usernameField.clear();
        usernameField.sendKeys(USERNAME);
        
        WebElement passwordField;
        try {
            passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        } catch (Exception e) {
            passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        }
        
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);
        WebElement loginBtn;
        try {
            loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("login")));
        } catch (Exception e1) {
            try {
                loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnLogin")));
            } catch (Exception e2) {
                loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' or contains(., 'Login') or contains(., 'Sign in')]")));
            }
        }
        loginBtn.click();
       WebElement messageElem = null;
        try {
            messageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flash")));
        } catch (Exception e1) {
            try {
                messageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("message")));
            } catch (Exception e2) {
                messageElem = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert, .notification, .message")));
            }
        }
        String loginMessage = messageElem.getText().trim();
        System.out.println("Login message: " + loginMessage);
        
        Assert.assertTrue(loginMessage.length() > 0, "Login message should not be empty");
         }
    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed.");
        }
    }
}