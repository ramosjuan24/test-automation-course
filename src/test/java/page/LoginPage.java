package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;


public class LoginPage {

    WebDriver driver;

    By inputUsername = By.id("txtUsername");
    By inputPassword = By.id("txtPassword");
    By btnLogin = By.id("btnLogin");
    By nameUser = By.id("welcome");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

   public void ingresoUsuario(String username){

        driver.findElement(inputUsername).click();
        driver.findElement(inputUsername).clear();
        driver.findElement(inputUsername).sendKeys(username);

   }

    public void ingresoPassword(String password){

        driver.findElement(inputPassword).click();
        driver.findElement(inputPassword).clear();
        driver.findElement(inputPassword).sendKeys(password);

    }

    public void clicBtnLogin(){

        driver.findElement(btnLogin).click();

    }

    public void validaSesion(){

        String name = driver.findElement(nameUser).getText();
        Assert.assertEquals(name,"Welcome Jasmine");

    }



}
