package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	
public class Activity1 {
	   public static void main(String[] args) {
	      
	        WebDriver driver = new FirefoxDriver();
	  
	        driver.get("https://alchemy.hguy.co/lms");
	      
	        String pageTitle = driver.getTitle();
	    
	        System.out.println("Page title is: " + pageTitle);
	        
	        if (pageTitle.equals("Alchemy LMS – An LMS Application")) {
	            System.out.println("Title matched successfully!");
	        } else {
	            System.out.println("Title did not match!");
	        }
	 
	        driver.close();
	    }
	}

