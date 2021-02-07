package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://nodeapptest3.herokuapp.com/");
    }

    @AfterClass
    public void cleanUp(){
        if (driver != null){
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
