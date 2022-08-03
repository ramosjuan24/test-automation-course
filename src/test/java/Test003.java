import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test003 {

    @Test
    public void Test001() throws InterruptedException {

        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        driver.manage().window().setSize(new Dimension(1440, 804));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='main_navbar']/ul/li[4]/a/span")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tabs-3-1-tab")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tabs-3-2-tab")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tabs-3-3-tab")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tabs-3-4-tab")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("tabs-3-5-tab")).click();

        driver.quit();
    }

}
