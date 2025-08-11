package pageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginPage {

    public @FindBy(xpath = "/html/body/div[2]/div[3]/div[1]/div/div[2]/a") WebElement btnSamplePages;
    public @FindBy(id = "user") WebElement txtUser;
    public @FindBy(id = "password") WebElement txtPass;
    public @FindBy(id = "login") WebElement btnLogin;
    public @FindBy(xpath = "/html/body/div[1]/div/div[1]/h3") WebElement txtHeader;

    public LoginPage(){
        super();
    }

    public void btnSample(){
        btnSamplePages.click();
    }

    public void txtUser(String user){
        txtUser.sendKeys(user);
    }

    public void txtPass(String password){
        txtPass.sendKeys(password);
    }

    public void btnLogin(){
        btnLogin.click();
    }

    public void txtHeader(){
        String actualText = txtHeader.getText();
        //Assert
        assertEquals("Dinesh's Pizza House", actualText, "El texto de handle no es el esperado");
    }

}
