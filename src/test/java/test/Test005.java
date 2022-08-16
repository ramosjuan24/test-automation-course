package test;

import ambiente.AbstracTest;
import org.testng.annotations.Test;
import page.LoginPage;

public class Test005 extends AbstracTest {

    /**
     *
     * test Login con estructura POM
     */
    @Test
    public void testLogin()  {

        LoginPage pageLogin = new LoginPage(driver);
        pageLogin.ingresoUsuario("Admin");
        pageLogin.ingresoPassword("admin123");
        pageLogin.clicBtnLogin();
        pageLogin.validaSesion();

    }

}
