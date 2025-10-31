package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity8_Selenium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/mouse-events");
      
        System.out.println("Title of the page is: " + driver.getTitle());
      
        Actions actions = new Actions(driver);
       
        WebElement cargoLockBtn = driver.findElement(By.xpath("//button[text()='Cargo.lock']"));
        actions.click(cargoLockBtn).perform();
        
        WebElement cargoTomlBtn = driver.findElement(By.xpath("//button[text()='Cargo.toml']"));
        actions.moveToElement(cargoTomlBtn).click().perform();
       
        WebElement message1 = driver.findElement(By.id("result"));
        System.out.println("Message after clicking Cargo.toml: " + message1.getText());
       
        WebElement srcBtn = driver.findElement(By.xpath("//button[text()='src']"));
        actions.doubleClick(srcBtn).perform();
       
        WebElement targetBtn = driver.findElement(By.xpath("//button[text()='target']"));
        actions.contextClick(targetBtn).perform();
       
        WebElement message2 = driver.findElement(By.id("result"));
        System.out.println("Message after right-click: " + message2.getText());
        
        driver.quit();
    }
}

