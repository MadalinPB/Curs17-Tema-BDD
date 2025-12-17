package com.qaschool.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;


public class SearchPage {

    private final SelenideElement baraSearch = $("#search_text_input");
    private final ElementsCollection rezultateSearch = $$(".search_results .resultDisplay");


    public void openFeed() {
        open("https://test.hapifyme.com/index.php");
    }

    public void searchFor(String numeUtilizator) {
        baraSearch.shouldBe(visible).setValue(numeUtilizator);
    }

    public void deschideMeniuRezultate(String numeIntrodus) {
        rezultateSearch.findBy(text(numeIntrodus)).shouldBe(visible).$("a").click();
    }

    public void shouldSeeProfilePageFor(String expectedName) {
        webdriver().shouldHave(urlContaining(expectedName.toLowerCase().replace(" ", "_")));
    }

    public void shouldSeeUserInResults(String expectedName) {
        rezultateSearch.findBy(text(expectedName)).shouldBe(visible);
    }

}