package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class Activity5_CheckElementDisplayed {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/dynamic-controls");
       
        System.out.println("Title of the page is: " + driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
      
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        
        WebElement toggleButton = driver.findElement(By.xpath("//button[text()='Remove Checkbox']"));
        toggleButton.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        
        try {
            checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
            System.out.println("Checkbox is displayed after removal: " + checkbox.isDisplayed());
        } catch (Exception e) {
            System.out.println("Checkbox is no longer visible on the page.");
        }
      
        driver.quit();
    }
}