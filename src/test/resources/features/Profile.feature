Feature: Profile

Scenarii: Cauta dupa un profil de user
Given Userul deschide pagina pentru postari si comentarii
When Userul cauta profilul "George Datcu"
And deschide profilul utilizatorului din rezultate
Then Pagina de profil a utilizatorului "George Datcu" este afisata
