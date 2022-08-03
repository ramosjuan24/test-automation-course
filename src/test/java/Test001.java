
import org.apache.commons.exec.OS;
import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Test001 {

    public static void main(String[] args)  {

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver");


        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        driver.quit();
        
    }


}