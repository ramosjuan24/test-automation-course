package ambiente;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class AbstracTest {

    public App app;
    public WebDriver driver;
    public WebDriver getDriver() {
        return driver;
    }

    @BeforeMethod
    public void setup() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--window-size=1366,768");
        //options.addArguments("disable-infobars");
        //options.addArguments("--headless");
        //options.addArguments("--incognito");
        driver = new ChromeDriver(options);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(6000);
        app = new App(driver);
    }

    @AfterClass
    public void metodoCerrarDriver(){
        driver.quit();
    }
}
