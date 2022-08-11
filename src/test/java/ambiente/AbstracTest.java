package ambiente;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class AbstracTest {

    public WebDriver driver;

    @BeforeClass
    public void setup(){

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--window-size=1366,768");
        //options.addArguments("disable-infobars");
        //options.addArguments("--headless");
        //options.addArguments("--incognito");
        driver = new ChromeDriver(options);

        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @AfterClass
    public void metodoCerrarDriver(){
        driver.quit();
    }
}
