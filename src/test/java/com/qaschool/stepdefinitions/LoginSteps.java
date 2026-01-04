package com.qaschool.stepdefinitions;

import io.cucumber.java.en.*;
import com.qaschool.pages.LoginPage;

import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.Assert.assertTrue;

public class LoginSteps {

    private final LoginPage loginPage = new LoginPage();

    @Given("utilizatorul deschide pagina de login")
    public void openLogin() {
        loginPage.openLogin();
    }

    @When("utilizatorul se logheaza cu email {String} si parola {String}")
    public void doLogin(String email, String pass) {
        loginPage.loginWith(email, pass);
    }

    @Then("utilizatorul ajunge in pagina principala")
    public void verifyHome() {
        assertTrue("Nu suntem in index.php", url().contains("index.php"));
    }
}
