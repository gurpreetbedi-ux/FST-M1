package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity3_UsingXpath {
    public static void main(String[] args) {
    
        WebDriver driver = new ChromeDriver();
      
        driver.get("https://training-support.net/webelements/login-form/");
       
        System.out.println("Title of the page is: " + driver.getTitle());
       
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("admin");
        
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("password");
  
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();
        
        System.out.println("Login button clicked using XPath locators!");
       
        driver.quit();
    }
}