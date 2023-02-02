package ApplitoolsPackage;

import com.applitools.eyes.RectangleSize;
import com.applitools.eyes.exceptions.DiffsFoundException;
import com.applitools.eyes.selenium.Eyes;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {

    private WebDriver driver;
    private Eyes eyes;

        @Before public void BeforeScenario(){

        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver.exe");

        eyes = new Eyes();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        eyes.setApiKey("6CBR3XxBj8jzI3EHE4G4E7j4X0Ybie1F990Z102fz3Iflg110");

        /*
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        driver.manage().window().maximize();
        driver.get("http://www.ah.nl");
        FileHandler.copy(screenshot.getScreenshotAs(OutputType.FILE), new File(".\\src\\test\\resources\\Screenshots\\LandingPage.png"));
        //WebElement element = driver.findElement(By.id("accept-cookies"));
        WebElement popup = driver.findElement(By.id("cookie-popup"));
        FileHandler.copy(popup.getScreenshotAs(OutputType.FILE), new File(".\\src\\test\\resources\\Screenshots\\CookiePopup.png"));
        driver.findElement(By.id("accept-cookies")).click();
        System.out.println(driver.getTitle());
        driver.quit();
        */
    }

    @Test public void Scenario(){

        eyes.open(driver, "ApplitoolsTest", "VerificationTest", new RectangleSize(1920, 1080));

        driver.get("http://www.ah.nl");
        eyes.checkWindow("Popup Page");
        driver.findElement(By.id("accept-cookies")).click();

        eyes.checkWindow("Landing Page");
        eyes.closeAsync();
    }


    @After public void CloseScenario() {
        driver.quit();
        eyes.abortIfNotClosed();
    }
}
