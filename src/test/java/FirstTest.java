import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstTest {

    WebDriver driver;

    @BeforeEach
    public void setUp(){
        System.setProperty("WebDriver.Chromedriver","/Users/gcarmona/Desktop/bin/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void landingPage() throws InterruptedException {
        driver.get("https://play1.automationcamp.ir/");
        Thread.sleep(3000);
        // crear parte con assert, eliminar import
        String actualTitle = driver.getTitle();
        System.out.println("Título de la página: " + actualTitle);

        String expectedTitle = "The Test Automation Playground";

        assertEquals(expectedTitle, actualTitle, "El título de la página no corresponde");

    }

    @AfterEach
    public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

}
