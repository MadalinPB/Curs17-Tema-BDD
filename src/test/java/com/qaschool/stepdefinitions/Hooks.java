package com.qaschool.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void beforeScenario() {
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 8000;
    }

    @After
    public void afterScenario(Scenario scenario) {
        // Selenide face oricum screenshot la fail în rapoartele lui,
        // dar aici e locul pentru cleanup:
        closeWebDriver();
    }
}