package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import sun.java2d.loops.TransformHelper;


public class Test002 {

    /**
     * Metodo de inicializacion de Selenium con Chromedriver
     * Con este metoo
     * como un TEST
     */

    @Test
    public void Test002() throws InterruptedException {

        String chromeDriverPath = System.getProperty("user.dir") + "/src/test/resources/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(8000);

    }

}
