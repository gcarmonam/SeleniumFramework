package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlertHandlingPage {

    public @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[2]/a") WebElement linkWaitConditions;
    public @FindBy(id = "alert_trigger") WebElement btnShowAlert;
    public @FindBy(id = "prompt_trigger") WebElement btnShowPrompt;
    public @FindBy(id = "alert_handled_badge") WebElement txtAlertHandle;
    public @FindBy(id = "confirm_cancelled_badge") WebElement txtAlertCancelled;

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

}
