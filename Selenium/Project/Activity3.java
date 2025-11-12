package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity3 {
    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://alchemy.hguy.co/lms");
      
        WebElement firstInfoBox = driver.findElement(By.xpath("(//h3)[1]"));
      
        String infoBoxTitle = firstInfoBox.getText();
      
        System.out.println("First info box title is: " + infoBoxTitle);
       
        if (infoBoxTitle.equals("Actionable Training")) {
            System.out.println("Title matches: Actionable Training :white_check_mark:");
        } else {
            System.out.println("Title does not match :x:");
        }
        
        driver.close();
    }
}










