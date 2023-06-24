package org.test_manager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import static java.util.concurrent.TimeUnit.SECONDS;

public class TestManager {
    public static WebDriver driver;

    @BeforeTest
    public WebDriver getWebInstance(){
        if(driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demowebshop.tricentis.com/");
        }
        return driver;
    }

    @AfterSuite
    public void closeWebInstance(){
        driver.close();
    }

    public void quitWebInstance(){
        driver.quit();
    }
}
