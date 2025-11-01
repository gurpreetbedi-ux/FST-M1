import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity5_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
    }
    @Test(priority = 1)
    public void testPageTitle() {
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertEquals(title, "Training Support");
    }
    @Test(priority = 2)
    public void testHeader() {
        String heading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Header text: " + heading);
        Assert.assertEquals(heading, "Training Support");
    }
    @Test(priority = 3)
    public void testButton() {
        driver.findElement(By.id("about-link")).click();
        String newTitle = driver.getTitle();
        System.out.println("New page title: " + newTitle);
        Assert.assertEquals(newTitle, "About Training Support");
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}