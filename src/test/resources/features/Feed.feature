Feature: Postare

Scenario: Adauga Postare
Given Userul deschide pagina pentru postari si comentarii
When Userul adauga o postare
Then Mesajul {string} este adaugat cu succes


