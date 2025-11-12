package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity4 {
    public static void main(String[] args) {
  
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://alchemy.hguy.co/lms");
      
        WebElement secondCourse = driver.findElement(By.xpath("(//h3[@class='uagb-ifb-title'])[2]"));
        
        String courseTitle = secondCourse.getText();
       
        System.out.println("Second most popular course title: " + courseTitle);
        
        if (courseTitle.equals("Email Marketing Strategies")) {
            System.out.println("Title matches correctly :white_check_mark:");
        } else {
            System.out.println("Title does not match :x:");
        }
        
        driver.close();
    }
}
