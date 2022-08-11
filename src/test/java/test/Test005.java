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

        LoginPage page = new LoginPage(driver);
        page.ingresoUsuario();
        page.ingresoPassword();
        page.clicBtnLogin();

    }

}
