package activities;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	
	public class Activity1_Clicklink {
	    public static void main(String[] args) {
	     
	        WebDriver driver = new ChromeDriver();
	        
	        driver.get("https://training-support.net");
	        
	        System.out.println("Title of the page is: " + driver.getTitle());
	      
	        WebElement aboutUsLink = driver.findElement(By.id("about-link"));
	        aboutUsLink.click();
	        
	        System.out.println("Title of the new page is: " + driver.getTitle());
	
	        driver.quit();
	    }
	}

