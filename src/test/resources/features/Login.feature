Feature: Login

  Scenario: Login succes
    Given utilizatorul deschide pagina de login
    When utilizatorul se logheaza cu email "bulf_mada@yahoo.com" si parola "gresit123"
    Then utilizatorul ajunge in pagina principala

  Scenario Outline: Login esuat
    Given utilizatorul deschide pagina de login
    When utilizatorul se logheaza cu email "<email>" si parola "<parola>"
    Then utilizatorul vede ca nu ajunge in pagina principala
    And pagina de login arunga o eroare relevanta

    Examples:
      | email                     | parola          |
      | bulf_mada@yahoo.com       | gresit123       |
      | invalid@email.com         | ParolaMeaSecreta|
