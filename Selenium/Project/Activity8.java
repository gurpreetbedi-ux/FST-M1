package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity8 {
    public static void main(String[] args) {
      
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://alchemy.hguy.co/lms");
        
        WebElement contactLink = driver.findElement(By.linkText("Contact"));
        contactLink.click();
       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     
        WebElement nameField = driver.findElement(By.id("wpforms-8-field_0"));
        WebElement emailField = driver.findElement(By.id("wpforms-8-field_1"));
        WebElement subjectField = driver.findElement(By.id("wpforms-8-field_3"));
        WebElement messageField = driver.findElement(By.id("wpforms-8-field_2"));
        nameField.sendKeys("Gurpreet Singh");
        emailField.sendKeys("gurpreet@example.com");
        subjectField.sendKeys("Course Inquiry");
        messageField.sendKeys("Hello, I would like to know more about your course structure.");
       
        WebElement sendButton = driver.findElement(By.id("wpforms-submit-8"));
        sendButton.click();
        
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement confirmationMsg = driver.findElement(By.id("wpforms-confirmation-8"));
        String msgText = confirmationMsg.getText();
        System.out.println("Confirmation message displayed: " + msgText);
        if (msgText.contains("Thanks for contacting us")) {
            System.out.println("Form submitted successfully :white_check_mark:");
        } else {
            System.out.println("Form submission failed :x:");
        }
    
        driver.close();
    }
}
