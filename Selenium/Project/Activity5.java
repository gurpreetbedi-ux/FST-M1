package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity5 {
    public static void main(String[] args) {
       
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://alchemy.hguy.co/lms");
      
        WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
      
        myAccountLink.click();
        
        String pageTitle = driver.getTitle();
       
        System.out.println("Page title is: " + pageTitle);
       
        if (pageTitle.equals("My Account – Alchemy LMS")) {
            System.out.println("You are on the correct page :white_check_mark:");
        } else {
            System.out.println("You are NOT on the correct page :x:");
        }
      
        driver.close();
    }
}