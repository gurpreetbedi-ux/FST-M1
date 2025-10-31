package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class Activity22_selenium {
    public static void main(String[] args) throws InterruptedException {
     
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/popups");
        System.out.println("Page title: " + driver.getTitle());
        
        WebElement alertBtn = driver.findElement(By.xpath("//button[@id='simple-alert']"));
        alertBtn.click();
        
        Alert alert = driver.switchTo().alert();
        System.out.println("JS Popup message: " + alert.getText());
        alert.accept();
        System.out.println(":white_check_mark: JavaScript pop-up closed");
        
        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='login-popup']"));
        loginBtn.click();
        
        Thread.sleep(2000);
       
        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
       
        username.sendKeys("admin");
        password.sendKeys("password");
        
        WebElement submitBtn = driver.findElement(By.xpath("//button[@id='login-button']"));
        submitBtn.click();
       
        Thread.sleep(1000);
        
        WebElement message = driver.findElement(By.xpath("//p[@id='login-message']"));
        System.out.println("Login message: " + message.getText());
       
        driver.quit();
    }
}