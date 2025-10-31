package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity6_Selemium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
      
        driver.get("https://training-support.net/webelements/dynamic-controls");
      
        System.out.println("Title of the page is: " + driver.getTitle());
        
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        
        System.out.println("Checkbox is selected? " + checkbox.isSelected());
      
        checkbox.click();
       
        System.out.println("Checkbox is selected after click? " + checkbox.isSelected());
        
        driver.quit();
    }
}
