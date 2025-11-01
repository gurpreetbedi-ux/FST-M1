
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity1_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
       
        driver = new FirefoxDriver();
     
        driver.manage().window().maximize();
    }
    @Test
    public void verifyPageTitleAndLink() {
       
        driver.get("https://training-support.net");
       
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
     
        Assert.assertEquals(title, "Example Domain", "Page title does not match!");
       
        String headingStyle = driver.findElement(By.tagName("h1")).getAttribute("style");
        System.out.println("Heading Style: " + headingStyle);
     
        driver.findElement(By.cssSelector("a")).click();
       
        String newTitle = driver.getTitle();
        System.out.println("New Page Title: " + newTitle);
    }
    @AfterClass
    public void tearDown() {
        
        driver.quit();
    }
}