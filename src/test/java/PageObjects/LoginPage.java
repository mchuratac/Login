package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(name = "txtUsuario") private WebElement txt_Usuario;
    @FindBy(name = "txtPassword") private WebElement txt_Password;
    @FindBy(xpath = "//button[@type=\"submit\"]") private WebElement btn_Ingresar;

    public LoginPage(WebDriver d) {
        driver = d;
        wait = new WebDriverWait (driver,30);
        PageFactory.initElements(driver,this);

    }
    public void IngresarUsuario(String Usuario){
        txt_Usuario.clear();
        txt_Usuario.sendKeys(Usuario);
    }

    public  void IngresarPassword(String Password){
        txt_Password.clear();
        txt_Password.sendKeys(Password);
    }

    public void ClickBtnIngresar(){
        wait.until(ExpectedConditions.elementToBeClickable(btn_Ingresar));
        btn_Ingresar.click();

    }

    private void Esperar (Integer Segundos){
        Integer Milisegundos = Segundos * 1000;





    }



}
