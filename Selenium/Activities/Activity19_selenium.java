package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class Activity19_selenium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/alerts");
       
        System.out.println("Page title is: " + driver.getTitle());
  
        WebElement confirmButton = driver.findElement(By.xpath("//button[@id='confirm-alert']"));
        confirmButton.click();
      
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm alert text: " + confirmAlert.getText());
      
        confirmAlert.accept();
        System.out.println("Confirm alert accepted.");

        confirmButton.click();
        confirmAlert = driver.switchTo().alert();
        System.out.println("Confirm alert text (dismiss): " + confirmAlert.getText());
        confirmAlert.dismiss();
        System.out.println("Confirm alert dismissed.");
       
        WebElement promptButton = driver.findElement(By.xpath("//button[@id='prompt-alert']"));
        promptButton.click();
      
        Alert promptAlert = driver.switchTo().alert();
        System.out.println("Prompt alert text: " + promptAlert.getText());
        
        promptAlert.sendKeys("Gurpreet");
        promptAlert.accept();
       
        WebElement message = driver.findElement(By.xpath("//p[@id='prompt-result']"));
        System.out.println("Result message: " + message.getText());

        driver.quit();
    }
}
