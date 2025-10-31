package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity12_selenium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/dynamic-content");
       
        System.out.println("Page title is: " + driver.getTitle());
        
        WebElement clickButton = driver.findElement(By.xpath("//button[@id='clickMe']"));
        clickButton.click();
       
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//h2[@id='message']"), "release"));
      
        WebElement message = driver.findElement(By.xpath("//h2[@id='message']"));
        System.out.println("Message displayed: " + message.getText());
      
        driver.quit();
    }
}