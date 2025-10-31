package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;
public class Activity17_selenium{
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/selects");
       
        System.out.println("Page title is: " + driver.getTitle());
       
        WebElement multiSelect = driver.findElement(By.xpath("//select[@id='multi-select']"));
     
        Select select = new Select(multiSelect);
      
        System.out.println("Is multiple select enabled? " + select.isMultiple());
       
        select.selectByVisibleText("Option 2");
        select.selectByIndex(2);
        select.selectByValue("4");
        System.out.println("Options selected:");
       
        List<WebElement> selectedOptions = select.getAllSelectedOptions();
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }
       
        select.deselectByValue("4");
        System.out.println("Deselected Option 4");
      
        select.deselectAll();
        System.out.println("All options deselected");
       
        driver.quit();
    }
}