package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
public class Activity20_selenium {
    public static void main(String[] args) throws InterruptedException {
      
        WebDriver driver = new ChromeDriver();
     
        driver.get("https://training-support.net/webelements/alerts");
      
        System.out.println("Page title: " + driver.getTitle());

        WebElement promptButton = driver.findElement(By.xpath("//button[@id='prompt-alert']"));
        promptButton.click();
       
        Alert promptAlert = driver.switchTo().alert();
     
        System.out.println("Alert message: " + promptAlert.getText());
     
        String name = "Gurpreet";
        promptAlert.sendKeys(name);
        
        promptAlert.accept();
        System.out.println(":white_check_mark: Alert accepted after entering name.");
       
        WebElement resultMessage = driver.findElement(By.xpath("//p[@id='prompt-result']"));
        System.out.println("Result message: " + resultMessage.getText());
      
        driver.quit();
    }
}