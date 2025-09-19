package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - Browser is open");
        System.setProperty("webdriver.chrome.driver","C:/Automation_Projects/CucumberJava/src/test/resources/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }
    @Given("user is on google search page")
    public void user_is_on_google_search_page() {
        System.out.println("Inside Step - User is on Google Search Page");
        driver.navigate().to("https://www.google.com");
    }
    @And("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {
        System.out.println("Inside Step - User enters a text in search box");
        driver.findElement(By.xpath("//textarea[@id='APjFqb' and @name='q' and @class='gLFyf']")).sendKeys("Automation Step By Step");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @When("hits enter")
    public void hits_enter() {
        driver.findElement(By.xpath("//textarea[@id='APjFqb' and @name='q' and @class='gLFyf']")).sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {
        System.out.println("Inside Step - User hits enter");
        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }
}
