package page;

import ambiente.AbstractScreen;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.io.ByteArrayInputStream;

public class LoginPage extends AbstractScreen{

    //WebDriver driver;

    //public LoginPage(WebDriver driver) {
      //  this.driver = driver;
    //}

    By inputUsername = By.name("username");
    By inputPassword = By.name("password");
    By btnLogin = By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button");
    By nameUser = By.id("welcome");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    //public LoginPage(WebDriver driver) {
        //super(driver);
    //}

    @Step("Ingreso de Usuario")
   public void ingresoUsuario(String username){

        driver.findElement(inputUsername).click();
        driver.findElement(inputUsername).clear();
        driver.findElement(inputUsername).sendKeys(username);
        Allure.addAttachment("ingresoUsuario", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Step("Ingreso de Password")
    public void ingresoPassword(String password){

        driver.findElement(inputPassword).click();
        driver.findElement(inputPassword).clear();
        driver.findElement(inputPassword).sendKeys(password);
        Allure.addAttachment("ingresoPassword", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
    }

    @Step("Clic en btn Ingresar")
    public void clicBtnLogin() throws InterruptedException {

        driver.findElement(btnLogin).click();
        Thread.sleep(4000);
        Allure.addAttachment("clicBtnLogin", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));

    }

    @Step("Clic en btn Ingresar")
    public void validaSesion(){

        String name = driver.findElement(nameUser).getText();
        Assert.assertEquals(name,"Welcome Jasmine");
        Allure.addAttachment("validaSesion", new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));


    }

}
