package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.DriverFactory;

public class AlertHandlingSteps extends DriverFactory {

    @Given("the user in on the homepage")
    public void the_user_in_on_the_homepage() {
        getDriver().get("https://play1.automationcamp.ir/");
    }

    @When("they navigate to the Wait conditions section")
    public void they_navigate_to_the_wait_conditions_section() {
        alertHandlingPage.WaitConditions();
    }

    @When("they click the Show alert button")
    public void they_click_the_show_alert_button() {
        alertHandlingPage.btnAlert();
    }

    @When("they click the Show prompt button")
    public void they_click_the_show_prompt_button() {
        alertHandlingPage.btnPrompt();
    }
    @When("they cancel the alert")
    public void they_cancel_the_alert() {
        alertHandlingPage.alertCancelled();
    }

    @When("they accept the alert")
    public void they_accept_the_alert() {
       alertHandlingPage.alertOK();
    }

    @When("they click the Trigger button")
    public void they_click_the_trigger_button() {
        alertHandlingPage.btnTrigger();
    }

    @When("they click the newly visible button")
    public void they_click_the_newly_visible_button() {
        alertHandlingPage.btnTarget();
    }

    @Then("the message {string} should be displayed")
    public void the_message_should_be_displayed(String alertHandle) {
        switch (alertHandle){
            case "Alert handled":
                alertHandlingPage.alertHandle(alertHandle);
                break;
            case "Cancelled":
                alertHandlingPage.alertCencelled(alertHandle);
                break;
            case "OK":
                alertHandlingPage.alertOk(alertHandle);
                break;
            case "Can you see me?":
                alertHandlingPage.alertClick(alertHandle);
                break;
            default:
                System.out.println("Unknow text");
        }
    }
}
