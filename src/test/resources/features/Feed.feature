Feature: Postare

Scenario: Adauga Postare
Given Userul deschide pagina pentru postari si comentarii
When Userul adauga postarea 'Salut'
Then Mesajul 'Salut' este adaugat cu succes


