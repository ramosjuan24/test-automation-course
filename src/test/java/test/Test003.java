package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test003 {

    /***
     * Estructurando nuestro test case
     * Anotaciones TestNG
     * Localizadores Web Selenium
     * Aserciones (AssertEquals) String
     */

    WebDriver driver;

    @BeforeClass
    public static void setupClass() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setup(){

        driver = new ChromeDriver();
    }

    @Test
    public void Test002() throws InterruptedException {

        driver.manage().window().maximize();

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.findElement(By.xpath("//input[@id='txtUsername']")).click();
        driver.findElement(By.cssSelector("#txtUsername")).clear();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).clear();
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        String nombre = driver.findElement(By.xpath("//*[@id='content']/div[2]/span")).getText();
        Assert.assertEquals(nombre, "( Username : Admin | Password : admin123 )");

        driver.findElement(By.id("btnLogin")).click();
    }

    @AfterMethod
    public void afterMethod() {

        driver.quit();

    }
}
