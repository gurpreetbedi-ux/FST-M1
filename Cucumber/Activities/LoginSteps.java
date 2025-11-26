package stepDefinitions;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass{
	
	@Given("the user is on the login page")
	public void openLoginPage() {
		// Open the page
		driver.get("https://training-support.net/webelements/login-form/");
		// Assertions
		Assertions.assertEquals("Selenium: Login Form", driver.getTitle());
	}
	
	@When("the user enters username and password")
	public void enterCredentials() {
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		usernameField.sendKeys("admin");
		passwordField.sendKeys("password");
		
		//Assertions
		Assertions.assertEquals("admin", usernameField.getDomProperty("value"));
		Assertions.assertEquals("password", passwordField.getDomProperty("value"));
	}
	
	@When("the user enters {string} and {string}")
	public void enterValidCredentials(String username, String password) {
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		
		//Assertions
		Assertions.assertEquals(username, usernameField.getDomProperty("value"));
		Assertions.assertEquals(password, passwordField.getDomProperty("value"));
	}
	
	@And("clicks the submit button")
	public void clickSubmit(){
		driver.findElement(By.xpath("//button[text()='Submit']")).click();		
	}
	
	@Then("get the confirmation message and verify it")
	public void verifyMessage() {
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5"))).getText();
		Assertions.assertEquals(message, "Welcome Back, Admin!");
	}
	
	@Then("verify success message as {string}")
	public void verifyMessage(String expectedMessage) {
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h2.mt-5"))).getText();
		Assertions.assertEquals(message, expectedMessage);
	}
	
	@Then("verify error message as {string}")
	public void verifyErrorMessage(String expectedErrorMessage) {
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("subheading"))).getText();
		Assertions.assertEquals(message, expectedErrorMessage);
	}

}
