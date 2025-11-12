package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity2 {
    public static void main(String[] args) {
       
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://alchemy.hguy.co/lms");
      
        WebElement heading = driver.findElement(By.tagName("h1"));
       
        String headingText = heading.getText();
       
        System.out.println("Website heading is: " + headingText);
       
        if (headingText.equals("Learn from Industry Experts"))
        		 {
            System.out.println("Heading matches correctly!");
        } else {
            System.out.println("Heading does not match!");
        }
    
        driver.close();
    }








