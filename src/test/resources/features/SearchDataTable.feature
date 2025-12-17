Feature: Cautare utilizatori cu un DataTable

  Scenario: Caut mai multi utilizatori folosind DataTable
    Given Userul deschide pagina pentru postari si comentarii
    When cauta utilizatori:
      | name          |
      | George Datcu  |
      | Bulf Madalin |
    Then fiecare utilizator apare in rezultatele de cautare
