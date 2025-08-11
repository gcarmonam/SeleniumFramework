package utils;

import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

public class Hooks{

    public static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        driver = DriverFactory.getDriver();
    }

    @Before
    public void beforeScenario(Scenario scenario){
        ExtentTestManager.startTest(scenario.getName(), "Escenario de pruebas");
    }

    @After
    public void afterScenario(Scenario scenario){
        if(scenario.isFailed()){
            ExtentTestManager.getTest().fail("El escenario falló: " + scenario.getName());
        } else {
            ExtentTestManager.getTest().pass("Escenario completado con éxito");
        }
        ReportManager.getInstance().flush();
    }

    @AfterAll
    public static void tearDown(){
        DriverFactory.closeDriver();
    }
}
