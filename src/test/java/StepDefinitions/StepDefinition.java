package StepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Given("user is on login page")
    public void user_is_on_login_page(){
        System.out.println("Inside Step - User is on login page");
    }

    @When("user enters username and password")
    public void user_enters_username_and_password(){
        System.out.println("Inside Step - User is on login page");
    }

    @When("Clicks on login button")
    public void Clicks_on_login_button(){
        System.out.println("Inside Step - User is on login page");
    }

    @When("User is navigated to the home page")
    public void User_is_navigated_to_the_home_page(){
        System.out.println("Inside Step - User is on login page");
    }


}
