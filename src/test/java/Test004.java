import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class Test004 {

   WebDriver driver;

   @BeforeClass
   public static void setupClass() {

      System.out.println("Entro por BeforeClass");
      WebDriverManager.chromedriver().setup();

   }

   @BeforeMethod
   public void setup(){
      System.out.println("Entro por BeforeMethod");
      ChromeOptions options = new ChromeOptions();
      //options.addArguments("--headless");
      driver = new ChromeDriver(options);
   }


   @Test
   public void Test002() throws InterruptedException {

      System.out.println("Entro por Test");
      driver.get("https://opensource-demo.orangehrmlive.com/");
      Thread.sleep(8000);

      //Usuario


      //clave


      //clic en iniciar


   }

   @AfterMethod
   public void afterMethod() throws InterruptedException {

      System.out.println("Entro por afterMetho");

   }

   @AfterClass
   public void afterClass() throws InterruptedException {

      driver.quit();
      System.out.println("Entro por afterClass");

   }

}
