import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.locators.RelativeLocator;
//import static org.openqa.selenium.support.locators.RelativeLocator.with;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Test005 {

    //Test con Selenium4 Localizadores Relativos
    //Elementos Abajo
    //Elementos Arriba
    //Cerca
    //A la Izquierda o a la Derecha

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }



    @Test
    public void testLogin() {
        WebElement loginPanel = driver.findElement(By.id("txtUsername"));
        loginPanel.click();
        loginPanel.clear();
        loginPanel.sendKeys("Admin");

        WebElement passwordPanel = driver.findElement(By.id("txtPassword"));
        passwordPanel.click();
        passwordPanel.clear();
        passwordPanel.sendKeys("admin123");

        WebElement btnLogin = driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        //WebElement credentials = driver.findElement(RelativeLocator.with(
                //By.tagName("span"))
                //.above(loginPanel));
        //System.out.println(credentials.getText());
    }

    public void testRelativeLocator() {
        WebElement loginPanel = driver.findElement(By.id("logInPanelHeading"));
    }

    public void testListOfElements() {
        //List<WebElement> allSocialMedia = driver.findElements(with(
          //      By.tagName("img"))
            //    .near(By.id("footer")));

        //for (WebElement socialMedia : allSocialMedia) {
          //  System.out.println(socialMedia.getAttribute("alt"));
        //}
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
