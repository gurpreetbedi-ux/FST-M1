package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Activity4_TargetPractice {
    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://training-support.net/webelements/target-practice");
        
        System.out.println("Title of the page is: " + driver.getTitle());
        
        WebElement thirdHeader = driver.findElement(By.xpath("//h3"));
        System.out.println("Third header text is: " + thirdHeader.getText());
        
        WebElement fifthHeader = driver.findElement(By.xpath("//h5"));
        String fifthHeaderColor = fifthHeader.getCssValue("color");
        System.out.println("Fifth header color is: " + fifthHeaderColor);
        
        WebElement purpleButton = driver.findElement(By.cssSelector(".purple"));
        String purpleColor = purpleButton.getCssValue("background-color");
        System.out.println("Purple button color is: " + purpleColor);
        WebElement slateButton = driver.findElement(By.className("slate"));
        System.out.println("Slate button text is: " + slateButton.getText());
        driver.quit();
    }
}
