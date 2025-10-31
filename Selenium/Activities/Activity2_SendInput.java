package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity2_SendInput {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/login-form/");
       
        System.out.println("Title of the page is: " + driver.getTitle());
       
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("admin");
      
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("password");
      
        WebElement loginButton = driver.findElement(By.cssSelector("button.ui.button"));
        loginButton.click();
    
        System.out.println("Login button clicked successfully!");
       
        driver.quit();
    }
}
