package com.qaschool.stepdefinitions;

import com.qaschool.pages.FeedPage;
import com.qaschool.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FeedSteps {

    private final FeedPage feedPage = new FeedPage();

    @Given("Userul deschide pagina pentru postari si comentarii")
    public void openFeed() {
        feedPage.openFeed();
    }

    @When("Userul adauga o postare")
    public void adaugaPostare (String inputText) {
        feedPage.adaugaPostare(inputText);
    }

    @Then("Mesajul {string} este adaugat cu succes")
    public void verificaPostarea (String inputText) {
        feedPage.cautaPostare(inputText);
    }
}
