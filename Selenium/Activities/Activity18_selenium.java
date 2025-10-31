package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class Activity18_selenium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/alerts");
        
        System.out.println("Page title is: " + driver.getTitle());
        
        WebElement simpleAlertButton = driver.findElement(By.xpath("//button[@id='simple-alert']"));
        simpleAlertButton.click();
        
        Alert simpleAlert = driver.switchTo().alert();
        
        System.out.println("Alert text is: " + simpleAlert.getText());
        
        simpleAlert.accept();
       
        System.out.println("Alert accepted successfully.");
  
        driver.quit();
    }
}