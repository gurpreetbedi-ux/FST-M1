package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity9_Selenium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/keyboard-events");
        
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
       
        WebElement inputField = driver.findElement(By.xpath("//input[@id='inputField']"));
        
        String message = "Hello Selenium from Java!";
        inputField.sendKeys(message);
       
        WebElement displayedText = driver.findElement(By.xpath("//p[@id='result']"));
        System.out.println("Displayed message: " + displayedText.getText());
        
        driver.quit();
    }
}