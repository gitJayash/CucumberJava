package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/resources/features/test_project1/module1/LoginDemo.feature", glue = {"StepDefinitions"},
monochrome = true,
        plugin = {"pretty", "html:target/HTMLReports"}
)


public class CucumberTest {
}
