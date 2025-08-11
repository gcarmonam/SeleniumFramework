package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Utilities;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertHandlingPage {

    public @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[2]/a") WebElement linkWaitConditions;
    public @FindBy(id = "alert_trigger") WebElement btnShowAlert;
    public @FindBy(id = "prompt_trigger") WebElement btnShowPrompt;
    public @FindBy(id = "visibility_trigger") WebElement btnVisTrigger;
    public @FindBy(id = "visibility_target") WebElement btnVisTarget;
    public @FindBy(id = "alert_handled_badge") WebElement txtAlertHandle;
    public @FindBy(id = "confirm_cancelled_badge") WebElement txtAlertCancelled;
    public @FindBy(id = "confirm_ok_badge") WebElement txtAlertOk;
    public @FindBy(xpath = "//h3[@class='popover-header']") WebElement txtClick;

    public AlertHandlingPage(){
        super();
    }


    public void WaitConditions(){
        linkWaitConditions.click();
    }

    public void btnAlert(){
        btnShowAlert.click();
    }

    public void btnPrompt(){
        btnShowPrompt.click();
    }

    public void btnTrigger(){
        btnVisTrigger.click();
    }

    public void btnTarget(){
        Utilities.waitForVisibility(btnVisTarget);
        btnVisTarget.click();
    }

    public void alertOK(){
        Utilities.alertAccept();
    }

    public void alertCancelled(){
        Utilities.alertCancelled();
    }

    public void alertHandle(String alertHandle){
        String actualText = txtAlertHandle.getText();
        //Assert
        assertEquals(alertHandle, actualText, "El texto de handle no es el esperado");
    }

    public void alertCencelled(String alertHandle){
        String actualText = txtAlertCancelled.getText();
        //Assert
        assertEquals(alertHandle, actualText, "El texto de handle no es el esperado");
    }

    public void alertOk(String alertHandle){
        String actualText = txtAlertOk.getText();
        //Assert
        assertEquals(alertHandle, actualText, "El texto de handle no es el esperado");
    }

    public void alertClick(String alertHandle) {
        Utilities.waitForVisibility(txtClick);
        String actualText = txtClick.getText();
        //Assert
        assertEquals(alertHandle, actualText, "El texto de handle no es el esperado");
    }

}
