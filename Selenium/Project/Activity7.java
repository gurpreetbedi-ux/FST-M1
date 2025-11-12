package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.List;
public class Activity7 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
       
        driver.get("https://alchemy.hguy.co/lms");
       
        WebElement allCoursesLink = driver.findElement(By.linkText("All Courses"));
        allCoursesLink.click();
       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        List<WebElement> courses = driver.findElements(By.xpath("//div[contains(@class,'ld_course_grid')]//h3"));
       
        System.out.println("Courses available on the page:");
        for (WebElement course : courses) {
            System.out.println(" - " + course.getText());
        }
       
        System.out.println("Total number of courses: " + courses.size());
        
        driver.close();
    }
}