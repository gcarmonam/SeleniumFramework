package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class alertHandlingSteps {
    @Given("the user in on the homepage")
    public void the_user_in_on_the_homepage() {
        System.out.println("the user in on the homepage");
    }

    @When("they navigate to the {string} section")
    public void they_navigate_to_the_section(String waitCondition) {
        System.out.println("they navigate to the "+waitCondition+" section");
    }

    @When("they click the {string} button")
    public void they_click_the_button(String showAlert) {
        System.out.println("they click the "+showAlert+" button");
    }

    @When("they accept the alert")
    public void they_accept_the_alert() {
       System.out.println("they accept the alert");
    }

    @Then("the message {string} should be displayed")
    public void the_message_should_be_displayed(String alertHandle) {
        System.out.println("the message "+alertHandle+" should be displayed");
    }
}
