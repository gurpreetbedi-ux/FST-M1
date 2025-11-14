package stepDefinitions;
 

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",                                     // readable console output
                "html:target/cucumber-reports/html-report",  // HTML report
                "junit:target/cucumber-reports/junit-report.xml", // JUnit XML
                "usage:target/cucumber-reports/usage.json"   // usage statistics
        },
        monochrome = true  // cleaner console output
)
public class TestRunner {
}