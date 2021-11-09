package Definitions;

import PageObjects.LoginPage;
import io.cucumber.java.en.*;

public class LoginDefinitions {
    LoginPage login;

    public LoginDefinitions() {
        login = new LoginPage(Hooks.driver);

    }

    @Given("el sistema este disponible")
    public void el_sistema_este_disponible() {
        Hooks.driver.get("http://10.0.203.16:8082/propuesta/index.jsp");

    }
    @When("ingrese el usuario {string}")
    public void ingrese_el_usuario(String string) {

    }
    @When("ingresar el password {string}")
    public void ingresar_el_password(String string) {

    }
    @When("doy click en ingresar")
    public void doy_click_en_ingresar() {

    }
    @Then("el sistema me muestra el home")
    public void el_sistema_me_muestra_el_home() {

    }


}
