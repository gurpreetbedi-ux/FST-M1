package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Activity14_Selenium {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/tables");
       
        System.out.println("Page title is: " + driver.getTitle());
        
        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println("Number of rows: " + rows.size());
        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println("Number of columns: " + cols.size());
        
        WebElement bookNameBeforeSort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
        System.out.println("Book Name in 5th row (before sort): " + bookNameBeforeSort.getText());
        
        WebElement priceHeader = driver.findElement(By.xpath("//table/thead/tr/th[4]"));
        priceHeader.click();
        
        WebElement bookNameAfterSort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[1]"));
        System.out.println("Book Name in 5th row (after sort): " + bookNameAfterSort.getText());
        
        driver.quit();
    }
}