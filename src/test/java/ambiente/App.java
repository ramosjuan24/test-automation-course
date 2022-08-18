package ambiente;

import org.openqa.selenium.WebDriver;
import page.HomePage;
import page.LoginPage;

public class App {

    public WebDriver driver;

    public App(WebDriver driver) {
        this.driver = driver;
        return;
    }

    public LoginPage PantallaLogin() {
        return new LoginPage(driver);
    }

    public HomePage PantallaHome() {
        return new HomePage(driver);
    }
}
