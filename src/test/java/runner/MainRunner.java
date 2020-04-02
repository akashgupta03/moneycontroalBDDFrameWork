package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import driver.DriverInitializer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = {"src/test/resources/features/"},
        glue = {"steps"},
        //tags = "TestBase",

        monochrome = true

)
public class MainRunner {




}