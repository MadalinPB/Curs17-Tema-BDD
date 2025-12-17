package com.qaschool.stepdefinitions;

import com.qaschool.pages.SearchPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class SearchSteps {

    private final SearchPage searchPage = new SearchPage();
    private List<String> numeCautate;

    @Given("Userul deschide pagina pentru postari si comentarii")
    public void openFeed() { searchPage.openFeed(); }

    @When("Userul cauta profilul \"George Datcu\"")
    public void cautaUser (String numeUser) {
        searchPage.searchFor(numeUser);
    }

    @When("deschide profilul utilizatorului din rezultate")
    public void deschidePaginaProfil (String numeUser) {
        searchPage.deschideMeniuRezultate(numeUser);
    }

    @When("cauta utilizatori:")
    public void cautaUsers (DataTable table) {
        List<Map<String, String>> rows = table.asMaps(String.class, String.class);
        numeCautate = rows.stream().map(r -> r.get("name")).toList();

                //cautare fiecare nume
        for (String name : numeCautate) {
            searchPage.searchFor(name);
        }
    }

    @Then("Pagina de profil a utilizatorului \"George Datcu\" este afisata")
    public void verificaPaginaProfil (String numeUser) {
        searchPage.shouldSeeProfilePageFor(numeUser);
    }

    @Then("fiecare utilizator apare in rezultatele de cautare")
    public void verificaFiecareUtilizator() {
        for (String name : numeCautate) {
            searchPage.searchFor(name);
            searchPage.shouldSeeUserInResults(name);
        }
    }
}
