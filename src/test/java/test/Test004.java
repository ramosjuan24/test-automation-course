package test;

import ambiente.AbstracTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test004 extends AbstracTest {

   /**
    * 6 - ChromeOptions en Selenium test.Test004
    * 7 – Herencia (extends) test.Test005
    * 8 - Page object Models (in Selenium) test.Test005
    * 9 - Ejercicio de Dashboard (Script)
    * 10 - Aserciones (AssertEquals) Boolean
    */

   /**
    * Explicacion de Herencia
    */

   @Test
   public void testLogin() throws InterruptedException {

      driver.findElement(By.xpath("//input[@id='txtUsername']")).click();
      driver.findElement(By.cssSelector("#txtUsername")).clear();
      driver.findElement(By.id("txtUsername")).sendKeys("Admin");

      driver.findElement(By.id("txtPassword")).click();
      driver.findElement(By.id("txtPassword")).clear();
      driver.findElement(By.id("txtPassword")).sendKeys("admin123");

      String nombre = driver.findElement(By.xpath("//*[@id='content']/div[2]/span")).getText();
      Assert.assertEquals(nombre, "( Username : Admin | Password : admin123 )");
      driver.findElement(By.id("btnLogin")).click();
      Thread.sleep(2000);

   }

}
