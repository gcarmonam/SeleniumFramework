package utils;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class Hooks{

    public static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.out.println("Entrando al Before");
        driver = DriverFactory.getDriver();
    }

    @AfterAll
    public static void tearDown(){
        System.out.println("Cerrando navegador");
        DriverFactory.closeDriver();
    }
}
