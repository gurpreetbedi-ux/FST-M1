package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity7_Selenium {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
      
        driver.get("https://training-support.net/webelements/dynamic-controls");
       
        System.out.println("Title of the page is: " + driver.getTitle());
       
        WebElement textField = driver.findElement(By.xpath("//input[@type='text']"));
       
        System.out.println("Text field is enabled? " + textField.isEnabled());
        
        WebElement enableButton = driver.findElement(By.xpath("//button[@id='toggleInput']"));
        enableButton.click();
       
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        System.out.println("Text field is enabled after clicking button? " + textField.isEnabled());
      
        driver.quit();
    }
}