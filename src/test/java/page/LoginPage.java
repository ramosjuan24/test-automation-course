package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

    WebDriver driver;

    By inputUsername = By.id("txtUsername");
    By inputPassword = By.id("txtPassword");
    By btnLogin = By.id("btnLogin");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

   public void ingresoUsuario(){

       driver.findElement(inputUsername).click();
       driver.findElement(inputUsername).clear();
       driver.findElement(inputUsername).sendKeys("Admin");

   }

    public void ingresoPassword(){

        driver.findElement(inputPassword).click();
        driver.findElement(inputPassword).clear();
        driver.findElement(inputPassword).sendKeys("admin123");

    }

    public void clicBtnLogin(){

        driver.findElement(btnLogin).click();

    }

}
