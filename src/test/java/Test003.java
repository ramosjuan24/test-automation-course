import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.*;


public class Test003 {

    WebDriver driver;

    @BeforeClass
    public static void setupClass() {

        System.out.println("Entro por BeforeClass");
        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void setup(){
        System.out.println("Entro por BeforeMethod");
        driver = new ChromeDriver();
    }


    @Test
    public void Test002() throws InterruptedException {


        System.out.println("Entro por Test");

        driver.get("https://opensource-demo.orangehrmlive.com/");

        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='txtUsername']")).click();
        driver.findElement(By.cssSelector("#txtUsername")).clear();
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).clear();
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");

        String nombre = driver.findElement(By.xpath("//*[@id='content']/div[2]/span")).getText();
        Assert.assertEquals(nombre, "( Username : Admin | Password : admin123 )");


        //driver.findElement(By.id("btnLogin")).click();
        //Thread.sleep(2000);

    }

    @AfterMethod
    public void afterMetho() throws InterruptedException {

        System.out.println("Entro por afterMetho");

    }

    @AfterClass
    public void afterClass() throws InterruptedException {

        driver.quit();
        System.out.println("Entro por afterClass");

    }

}
