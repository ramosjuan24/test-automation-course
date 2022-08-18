package ambiente;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AbstractScreen {

    public WebDriver driver;

    public AbstractScreen(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitForElement(By locator) throws Exception {

        WebDriverWait wait = new WebDriverWait(driver,30);

        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        } catch (ElementNotVisibleException e) {
            Assert.fail("Elemento no encontrado" + e.getMessage());
            throw e;
        }
    }


    public void suma(){

    }

    public void resta(){

    }

    public void division(){

    }

    public void multiplicacion(){

    }

}
