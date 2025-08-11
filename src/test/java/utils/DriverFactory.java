package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageLocators.AlertHandlingPage;
import pageLocators.LoginPage;

import java.time.Duration;

public class DriverFactory {

    protected static WebDriver driver;
    public static AlertHandlingPage alertHandlingPage;
    public static LoginPage loginPage;

    public static WebDriver getDriver(){
        if (driver == null){
                System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");
                driver = new ChromeDriver();
                // Manage size
                driver.manage().window().maximize();
                //Wait
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            //Inicializa PageObjets
            alertHandlingPage   = PageFactory.initElements(driver, AlertHandlingPage.class);
            loginPage           = PageFactory.initElements(driver, LoginPage.class);
        }
        return driver;
    }

    public static void closeDriver(){
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
