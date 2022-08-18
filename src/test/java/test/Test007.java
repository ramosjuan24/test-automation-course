package test;

import ambiente.AbstracTest;
import io.qameta.allure.*;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utils.Listeners.TestListener;

@Epic("Web Application Regression Testing")
@Feature("Login Page Tests")
@Listeners({TestListener.class})
public class Test007 extends AbstracTest {

    @Severity(SeverityLevel.NORMAL)
    @Test(priority = 0, description = "Verify Login Page")
    @Description("Test Description : Verify the title of Login Page")
    @Story("Title of Login Page")
    public void testSearchJobs() throws InterruptedException {

      app.PantallaLogin().ingresoUsuario("Admin");
      app.PantallaLogin().ingresoPassword("admin123");
      app.PantallaLogin().clicBtnLogin();
      //app.PantallaLogin().validaSesion();


        //pageHome.clicMenuDirectory();
        //pageHome.ingresandoNameJobs("QA Automation");
        //pageHome.selectComboboxJobs("Content Specialist");
        //pageHome.selectComboboxLocation("3");
        //pageHome.clicBtnSearch();
        //pageHome.textReponse();

    }

}
