package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Activity11_Selenium {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/dynamic-controls");
       
        System.out.println("Page title is: " + driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        WebElement toggleButton = driver.findElement(By.xpath("//button[@id='toggleCheckbox']"));
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       
        toggleButton.click();
       
        wait.until(ExpectedConditions.invisibilityOf(checkbox));
        System.out.println("Checkbox is now removed.");
       
        toggleButton.click();
       
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='checkbox']")));
        
        checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkbox.click();
        System.out.println("Checkbox is selected.");
       
        driver.quit();
    }
}