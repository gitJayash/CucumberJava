package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.loginPage;

import java.time.Duration;

public class LoginDemoSteps_POM {
    WebDriver driver = null;
    loginPage login;

    @Given("Browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - Browser is open");
        System.setProperty("webdriver.chrome.driver","C:/Automation Projects/CucumberJava/src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
    }

    @And("user is on login")
    public void user_is_on_login() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("User enters username and password")
    public void user_enters_username_and_password() {

        login = new loginPage(driver);

        login.enterUsername("standard_user");
        login.enterPassword("secret_sauce");


        //driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        //driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("User clicks on login")
    public void User_clicks_on_login() {

       login.clickLogin();
        //driver.findElement(By.xpath("//input[@id='login-button']")).click();

    }

    @Then("User is navigated to the home")
    public void user_is_navigated_to_the_home() {

        login.checkLogOutIsDisplayed();
       //driver.findElement(By.id("page_wrapper")).isDisplayed();


        driver.close();
        driver.quit();

    }
}
