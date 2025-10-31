package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Activity16_selenium {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
   
        driver.get("https://training-support.net/webelements/selects");
      
        System.out.println("Page title is: " + driver.getTitle());
       
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='single-select']"));
       
        Select select = new Select(dropdown);
     
        select.selectByVisibleText("Option 2");
        System.out.println("Selected option by visible text: Option 2");

        select.selectByIndex(2);
        System.out.println("Selected option by index: Option 3");
       
        select.selectByValue("4");
        System.out.println("Selected option by value: Option 4");
       
        List<WebElement> allOptions = select.getOptions();
        System.out.println("All options in the dropdown:");
        for (WebElement option : allOptions) {
            System.out.println(option.getText());
        }
        // Close the browser
        driver.quit();
    }
}