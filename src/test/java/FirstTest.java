import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("WebDriver.Chromedriver","/Users/gcarmona/Desktop/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Implicit Wait, para reemplazar las esperas explícitas (Thread.sleep)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void landingPage() throws InterruptedException {
        //Ir a sitio web
        driver.get("https://play1.automationcamp.ir/");

        //Obtener el título de sitio web
        String actualTitle = driver.getTitle();
        System.out.println("Título de la página: " + actualTitle);
        String expectedTitle = "The Test Automation Playground";
        assertEquals(expectedTitle, actualTitle, "El título de la página no corresponde");

        //Interactuar con elemento dentro de home page
        WebElement linkWaitConditions = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[2]/a"));
        linkWaitConditions.click();


        //Interactuar con elemento Show alert
        WebElement alertButton = driver.findElement(By.id("prompt_trigger"));
        alertButton.click();

        //Cambiar foco a Alert y aceptar
        try{
            WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.alertIsPresent());
            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        } catch (NoAlertPresentException e) {
            System.out.println("No se encontró el elemento Alert");
        }


        WebElement alertHandle = driver.findElement(By.id("confirm_cancelled_badge"));
        String actualText = alertHandle.getText();
        String expectedText = "Cancelled";
        //Assert
        assertEquals(expectedText, actualText, "El texto de handle no es el esperado");

    }

    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
