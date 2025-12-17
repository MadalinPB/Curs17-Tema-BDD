package com.qaschool.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class FeedPage {

    private By ButonPost = By.cssSelector("textarea[id='post_button']");
    private By InputTextComentariu_Postare = By.cssSelector("textarea[id='post_text']");
    private ElementsCollection WebElementPostareIntrodusa = $$("#post_body .post_body_content");

    public void openFeed() {
        open("https://test.hapifyme.com/index.php");
    }

    public void adaugaPostare(String inputText) {
        $(InputTextComentariu_Postare).setValue(inputText);
        $(ButonPost).click();
    }

    public void cautaPostare(String textDeIdentificat) {
        WebElementPostareIntrodusa
                .findBy(text(textDeIdentificat))
                .shouldBe(visible);
    }
}