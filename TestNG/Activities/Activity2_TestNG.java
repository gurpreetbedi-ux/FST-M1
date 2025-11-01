
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class Activity2_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");

        driver = new FirefoxDriver();
        driver.manage().window().maximize(); 
        driver.get("https://training-support.net");
    }
    @Test(priority = 1)
    public void verifyTitle() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertEquals(title, "Example Domain", "Title does not match!");
    }
    @Test(priority = 2)
    public void verifyHeadingText() {
        String heading = driver.findElement(By.tagName("h1")).getText();
        System.out.println("Heading: " + heading);
        Assert.assertEquals(heading, "Example Domain", "Heading text is incorrect!");
    }
    @Test(priority = 3)
    public void verifyParagraphPresence() {
        String paragraph = driver.findElement(By.tagName("p")).getText();
        System.out.println("Paragraph: " + paragraph);
        Assert.assertTrue(paragraph.contains("illustrative examples"), "Paragraph text not found!");
    }
    @Test(priority = 4)
    public void clickLinkAndCheckNewPage() {
        driver.findElement(By.cssSelector("a")).click();
        String newTitle = driver.getTitle();
        System.out.println("New Page Title: " + newTitle);
        Assert.assertTrue(newTitle.length() > 0, "New page title should not be empty!");
    }
    @AfterClass
    public void tearDown() {
       
        driver.quit();
        System.out.println("Browser closed successfully.");
    }
}