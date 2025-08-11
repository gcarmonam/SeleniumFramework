package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class LoginSteps extends DriverFactory {

    @When("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.btnSample();
    }

    @When("the user enters a valid {string} and {string}")
    public void the_user_enters_a_valid_and(String user, String pass) {
        loginPage.txtUser(user);
        loginPage.txtPass(pass);
    }

    @When("clicks the login button")
    public void clicks_the_login_button() {
        loginPage.btnLogin();
    }

    @Then("the user should be redirected to the dashboard")
    public void the_user_should_be_redirected_to_the_dashboard() {
        loginPage.txtHeader();
    }

}
