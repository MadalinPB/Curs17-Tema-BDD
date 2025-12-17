package com.qaschool.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class LoginPage {

    private By email = By.cssSelector("input[name='log_email']");
    private By password = By.cssSelector("input[name='log_password']");
    private By loginBtn = By.cssSelector("input[name='login_button']");

    public void openLogin() {
        open("https://test.hapifyme.com/login_register.php");
    }

    public void loginWith(String user, String pass) {
        $(email).setValue(user);
        $(password).setValue(pass);
        $(loginBtn).click();
    }
}
