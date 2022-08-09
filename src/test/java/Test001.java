
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test001 {

    /**
     * Metodo de inicializacion Java (Main)
     * Clase puede ser ejecutada pero no es reconocida
     * como un TEST
     * @param args
     */
    public static void main(String[] args)  {

        System.out.println("Hola Mundo");

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        driver.quit();

    }

}