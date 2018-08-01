# Customers Database #
Napisał do Ciebie klient ze zleceniem który chciałby mieć możliwość synchronizacji danych na temat klientów z innym systemem w którym te dane już się znajdują.
Niestety istniejący system nie udostępnia możliwości pobrania z niego informacji o klientach, dlatego też zleceniodawca dostarcza Ci plik customers.csv który zawiera wyeksportowaną listę klientów jego systemu.

#### Napisz importer który dostarczy funkcjonalność: ####

1. Wczytuje dane z przekazanego pliku i zapisuje je do bazy MongoDB.
2. Jeśli dany rekord istnieje (e-mail musi być unikatowy) dany rekord powinien zostać zaaktualizowany .
3. Zaimportowany klient powinien posiadać pole active które będzie definiowało czy posiada aktywne konto (pola tego nie ma w dostarczonym pliku csv).
4. Każdy klient powinien otrzymać też dane do logowania. Jako że dane te nie są udostępnione w pliku, na początku konto powinno zostać wygenerowane. Login = e-mail, hasło = pierwsza litera imienia i nazwisko (np. jkowalski). 
5. Adres powinien być reprezentowany jako odrępna struktura wewnątrz klienta (np. klasa Address)
6. Dodaj także pola data utworzenia oraz data modyfikacji.
7. Jeśli ponownie wczytany zostanie plik i na jego liście znajdzie się login który już istnieje to klient powinien zostać zaaktualizowany na podstawie nowych danych a data modyfikacji powinna zostać odświeżona.
8. Jeśli dany rekord w pliku nie zawiera e-maila, imienia lub nazwiska rekord powinien zostać pominięty podsczas importu. 

#### Poza importerem należy dodać funkcjonalność: ####

1. Logowania użytkowników po podaniu loginu i hasła (należy sprawdzyć czy konto jest aktywne).
2. Dezaktywowania konta użytkownika na podstawie loginu. 
3. Możliwość pobrania wszystkich klientów jak również klienta po loginie.

#### Dodatkowo zleceniodawca potrzebuje mieć wgląd do historii importowanych klientów. Twój importer po zakończonej operacji powinien więc zapisywać wyniki. ####

1. Data wykonania importu.
2. Ilu nowych klientów dodano + lista nowych kont.
3. Ilu klientów aktualizowano + lista zmodyfikowanych kont.
4. Ilu klientów pominięto podczas importu (np. brak pola e-mail w pliku).

#### Dodaj metody pozwalające pobierać informacje o historii: ####

1. Pobierz pełną historię (pobiera wszystkie dane o nowych/zmodyfikowanych kontach oraz listę kont których dotyczyły operacje.)
2. Pobierz skróconą historię (pobiera tylko datę wykonanego importu oraz wartości liczbowe - ile kont utworzono, ile zmodyfikowano oraz ilu utworzyć się nie dało).

