package test;

import ambiente.AbstracTest;
import org.testng.annotations.Test;
import page.HomePage;
import page.LoginPage;


public class Test006 extends AbstracTest {

    @Test
    public void testSearchJobs() throws InterruptedException {

        LoginPage pageLogin = new LoginPage(driver);
        HomePage pageHome = new HomePage(driver);

        pageLogin.ingresoUsuario("Admin");
        pageLogin.ingresoPassword("admin123");
        pageLogin.clicBtnLogin();
        //pageLogin.validaSesion();

        pageHome.clicMenuDirectory();
        pageHome.ingresandoNameJobs("QA Automation");
        pageHome.selectComboboxJobs("Content Specialist");
        pageHome.selectComboboxLocation("3");
        pageHome.clicBtnSearch();
        pageHome.textReponse();


        Thread.sleep(20000);

    }

}
