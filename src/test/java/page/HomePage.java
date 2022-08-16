package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By menuDirectory = By.id("menu_directory_viewDirectory");
    By nameInput = By.id("searchDirectory_emp_name_empName");
    By selectJobs = By.id("searchDirectory_job_title");
    By selectLocation = By.id("searchDirectory_location");
    By btnSearch = By.id("searchBtn");
    By textoResponse = By.xpath("//*[@id='content']/div[2]/div[2]");


    public void clicMenuDirectory(){

        driver.findElement(menuDirectory).click();
    }

    public void ingresandoNameJobs(String jobs){

        driver.findElement(nameInput).click();
        driver.findElement(nameInput).clear();
        driver.findElement(nameInput).sendKeys(jobs);
    }

    public void selectComboboxJobs(String nameJobs){

        WebElement comboJobs = driver.findElement(selectJobs);
        Select selectJobs = new Select(comboJobs);
        selectJobs.selectByVisibleText(nameJobs);


    }

    public void selectComboboxLocation(String location){

        WebElement comboLocation = driver.findElement(selectLocation);
        Select selectLocation = new Select(comboLocation);
        selectLocation.selectByValue(location);
    }

    public void clicBtnSearch(){

      driver.findElement(btnSearch).click();
    }

    public void textReponse(){

        //Espera Implicita
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //Espera Explicita
        WebDriverWait wait = new WebDriverWait(driver, 20);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(textoResponse));


        String texto = wait.until(ExpectedConditions.visibilityOfElementLocated(textoResponse)).getText();
        System.out.println("Reponse :" + texto);

    }




}
