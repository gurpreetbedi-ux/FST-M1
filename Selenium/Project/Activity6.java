package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity6 {
    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://alchemy.hguy.co/lms");
       
        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
        myAccountLink.click();
      
        WebElement loginButton = driver.findElement(By.xpath("//a[contains(@class, 'ld-login')]"));
        loginButton.click();
       
        WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys("root");
      
        WebElement passwordField = driver.findElement(By.id("user_pass"));
        passwordField.sendKeys("pa$$w0rd");
       
        WebElement submitButton = driver.findElement(By.id("wp-submit"));
        submitButton.click();
        
        String pageTitle = driver.getTitle();
        System.out.println("Page title after login: " + pageTitle);
      
        if (driver.findElement(By.linkText("Logout")).isDisplayed()) {
            System.out.println("Login successful :white_check_mark:");
        } else {
            System.out.println("Login failed :x:");
        }
       
        driver.close();
    }
}