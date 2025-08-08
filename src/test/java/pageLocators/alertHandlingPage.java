package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Utilities;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class alertHandlingPage {

    public @FindBy(xpath = "/html/body/div[2]/div[1]/div[1]/div/div[2]/a") WebElement linkWaitConditions;
    public @FindBy(id = "alert_trigger") WebElement btnShowAlert;
    public @FindBy(id = "alert_handled_badge") WebElement txtAlertHandle;

    public alertHandlingPage(){
        super();
    }


    public void WaitConditions(){
        linkWaitConditions.click();
    }

    public void btnAlert(){
        btnShowAlert.click();
    }

    public void alertOK(){
        Utilities.alertAccept();
    }

    public void alertHandle(){
        String actualText = txtAlertHandle.getText();
        String expectedText = "Alert handled";
        //Assert
        assertEquals(expectedText, actualText, "El texto de handle no es el esperado");
    }

}
