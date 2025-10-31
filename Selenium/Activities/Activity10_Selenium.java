package activities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Activity10_Selenium {
    public static void main(String[] args) {
       
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://training-support.net/webelements/drag-drop");
    
        System.out.println("Page title is: " + driver.getTitle());
      
        WebElement ball = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropZone1 = driver.findElement(By.xpath("//div[@id='droppable']"));
        WebElement dropZone2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
        
        Actions actions = new Actions(driver);
       
        actions.dragAndDrop(ball, dropZone1).build().perform();
        
        String message1 = dropZone1.getText();
        System.out.println("Message after first drop: " + message1);
       
        actions.dragAndDrop(ball, dropZone2).build().perform();
       
        String message2 = dropZone2.getText();
        System.out.println("Message after second drop: " + message2);
       
        driver.quit();
    }
}