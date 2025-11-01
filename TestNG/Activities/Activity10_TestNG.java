import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
public class Activity10_TestNG {
    WebDriver driver;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.training-support.net/selenium/simple-form");
    }
    @Test
    public void readExcelAndSubmitForm() throws Exception {
        FileInputStream fis = new FileInputStream(new File("C:\\TestData\\UserData.xlsx"));
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        for (Row row : sheet) {
            String firstName = row.getCell(0).getStringCellValue();
            String lastName = row.getCell(1).getStringCellValue();
            String email = row.getCell(2).getStringCellValue();
            String phone = row.getCell(3).getStringCellValue();
            driver.findElement(By.id("firstName")).clear();
            driver.findElement(By.id("firstName")).sendKeys(firstName);
            driver.findElement(By.id("lastName")).clear();
            driver.findElement(By.id("lastName")).sendKeys(lastName);
            driver.findElement(By.id("email")).clear();
            driver.findElement(By.id("email")).sendKeys(email);
            driver.findElement(By.id("number")).clear();
            driver.findElement(By.id("number")).sendKeys(phone);
            driver.findElement(By.cssSelector(".ui.green.button")).click();
            driver.switchTo().alert().accept();
            driver.navigate().refresh();
        }
        workbook.close();
        fis.close();
    }
    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}