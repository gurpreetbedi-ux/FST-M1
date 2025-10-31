package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Activity13_Selenium {
    public static void main(String[] args) {
      
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/tables");
       
        System.out.println("Page title is: " + driver.getTitle());
        
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        
        List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
        System.out.println("Number of columns: " + cols.size());
       
        System.out.println("Values in the third row:");
        List<WebElement> thirdRow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for (WebElement cell : thirdRow) {
            System.out.print(cell.getText() + "  ");
        }
        System.out.println(); // for line break
       
        WebElement cellValue = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println("Value at second row, second column: " + cellValue.getText());
   
        driver.quit();
    }
}