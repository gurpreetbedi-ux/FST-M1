package selenium_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Activity9 {
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
       )
        WebElement courseLink = driver.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
        courseLink.click();
      
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement firstLesson = driver.findElement(By.xpath("//a[contains(@class,'ld-lesson-title')]"));
        firstLesson.click();
       
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       
        String lessonTitle = driver.getTitle();
        System.out.println("Lesson page title: " + lessonTitle);
       
        try {
            WebElement markCompleteButton = driver.findElement(By.xpath("//input[@value='Mark Complete']"));
            markCompleteButton.click();
            System.out.println("Lesson marked as complete :white_check_mark:");
        } catch (Exception e) {
            System.out.println("Mark Complete button not found or already completed :x:");
        }
       
        driver.close();
    }
}










