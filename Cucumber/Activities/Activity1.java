package stepDefinitions;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Activity1 extends BaseClass {
	@Given("user is on the TS homepage")
	public void openTSHomepage() throws Throwable {
		// Open the browser
		driver.get("https://training-support.net");
		assertEquals(driver.getTitle(), "Training Support");
	}

	private void assertEquals(@Nullable String title, String string) {
		// TODO Auto-generated method stub
		
	}

	@When("the user clicks on the About Us link")
	public void clickButton() throws Throwable {
		driver.findElement(By.linkText("About Us")).click();
	}

	@Then("they are redirected to another page")
	public void aboutUsPage() throws Throwable {
		wait.until(ExpectedConditions.titleIs("About Training Support"));
		String pageHeading = driver.findElement(By.cssSelector("h1.text-center")).getText();

		System.out.println("New page title is: " + pageHeading);
		assertEquals(pageHeading, "About Us");
	}
}
