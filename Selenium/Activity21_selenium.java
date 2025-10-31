package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;
public class Activity21_selenium {
    public static void main(String[] args) throws InterruptedException {
      
        WebDriver driver = new ChromeDriver();
     
        driver.get("https://training-support.net/webelements/windows");
        System.out.println("Parent window title: " + driver.getTitle());
    
        String parentWindow = driver.getWindowHandle();
        System.out.println("Parent Window Handle: " + parentWindow);
      
        WebElement newTabButton = driver.findElement(By.xpath("//button[@id='open-new-tab']"));
        newTabButton.click();
       
        Thread.sleep(2000);
      
        Set<String> allWindows = driver.getWindowHandles();
        System.out.println("All window handles: " + allWindows);
       
        for (String window : allWindows) {
            if (!window.equals(parentWindow)) {
                driver.switchTo().window(window);
                break;
            }
        }
       
        System.out.println("New tab title: " + driver.getTitle());
      
        WebElement heading = driver.findElement(By.xpath("//h1"));
        System.out.println("Heading on new tab: " + heading.getText());
      
        driver.close();
        System.out.println(":white_check_mark: New tab closed");
       
        driver.switchTo().window(parentWindow);
        System.out.println("Back to parent tab: " + driver.getTitle());
      
        driver.quit();
    }
}