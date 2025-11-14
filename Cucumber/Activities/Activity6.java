package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class Activity6 {
    WebDriver driver;
    @Given("^user is on the To-Do list page$")
    public void userIsOnTodoPage() {
        driver = new ChromeDriver();
        driver.get("https://example.com/todo");   // update page URL
    }
    @When("^user adds the following tasks$")
    public void userAddsTasks(DataTable data) {
        List<String> tasks = data.asList();
        for (String task : tasks) {
            WebElement input = driver.findElement(By.id("taskInput"));
            input.sendKeys(task);
            driver.findElement(By.id("addTaskButton")).click();
        }
    }
    @Then("^they can see the task added to the list$")
    public void verifyTasksAdded() {
        List<WebElement> items = driver.findElements(By.cssSelector(".task-item"));
        for (WebElement item : items) {
            System.out.println("Task displayed: " + item.getText());
        }
        driver.quit();
    }
}