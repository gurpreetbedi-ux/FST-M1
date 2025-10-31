package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity15_Selenium {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/dynamic-attributes");
        
        System.out.println("Page title is: " + driver.getTitle());
        
        WebElement username = driver.findElement(By.xpath("//input[contains(@class, 'username')]"));
        username.sendKeys("admin");
       
        WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
        password.sendKeys("password");
        
        WebElement loginButton = driver.findElement(By.xpath("//button[contains(@class, 'ui button')]"));
        loginButton.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation")));
        
        System.out.println("Success message: " + message.getText());
        
        driver.quit();
    }
}