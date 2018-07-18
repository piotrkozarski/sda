# *** System pocztowy *** #

Zostałeś poproszony o dostarczenie systemu dla nowo powstałej firmy kurierskiej/pocztorej.
System będzie wykorzystywany przez kurierów i obsługę firmy, jak również przez klientów.
Pracodawca dostarczył Ci prostu interfejs graficzny w konsoli (git clone https://lbednarski@bitbucket.org/sdaprojects/postalsystem.git) i poprosił cię o dodanie kilku podstawowych funkcji.

### 1. Nadawanie przesyłki ###
Po wybraniu tej opcji, kurier powinien być poproszony o wprowadzenie kilku dodatkowych informacji:

- Imię i nazwisko nadawcy oraz jego adres.
- Imię i nazwisko odbiorcy oraz jego adres.
- Zawartość (krótki opis).
- Data nadania

Po wprowadzeniu poprawnie wszystkich danych, przesyłka powinna zostać zapisana w bazie danych (póki co niech będzie to jakaś kolekcja).
Przed zapisem informacje o przesyłce powinny zostać rozszerzone o wygenerowany identyfikator jak również status przesyłki powinien zostać ustawiony na NEW.

### 2. Wydanie przesyłki ###
Kurier wprowadza identyfikator przesyłki. W odpowiedzi system wyświetla dane odbiorcy oraz informację o potwierdzeniu przesyłki (np. Czy paczka została wydana? Wciśnij „T”). Po wydaniu przesyłki data wydania powinna zostać ustawiona a jej status powinien zmienić się na FINISHED.
### 3. Przekazanie paczki ###
Opcja wykorzystywana przez obsługę firmy. Wybierając tę opcję należy przekazać identyfikator paczki oraz adres pod który paczka została przekazana (adresy te będą magazynami firmy). Informacja o przekazaniu paczki powinna zostać zapisana na liście tak aby klient mógł śledzić przesyłkę. Po przekazaniu paczki status powinien zostać zmieniony na PROCESSING.
### 4. Status przesyłki ###
Po przekazaniu identyfikatora przesyłki w odpowiedzi system wyświetla informację o przesyłce - nadawca, odbiorca, status oraz tracking przesyłki, np.:

* Nadawca: Jan Kowalski 
* Odbiorca: Jan Nowak, Zbożowa 15, 33-444 Szczecin
* Status: W trakcie realizacji
* Śledzenie:
    * Jakis Adres po przekazaniu
    * Jakis Adres po przekazaniu
    * Księcia Bogusława X 10/4, 55-444 Szczecin

# *** II ETAP ROZWOJU *** #
Jeśli szybko poradziłeś sobie z powyższą funkcjonalnością, warto byłoby rozbudować system o kolejne możliwości:

- Nadając przesyłkę dodaj opcję typu wysyłki - ekonomiczna, priorytetowa, kurierska
- Dodaj listę oddziałów firmy. Podczas przekazywania przesyłki do kolejnej lokalizacji możliwe jest przekazanie jej do takiej która znajduje się na liście.
- Wydawanie przesyłki możliwe jest tylko i wyłącznie pod warunkiem jeśli przesyłka znajduje się w oddziale firmy w mieście odbiorcy.
- Jeśli firma nie posiada oddziału w danym mieście, możliwe jest wydanie paczki z dowolnego oddziału.
- Status przesyłki przedstaw w czytelniejszej formie:

Odbiorca:           Jan Nowak, Zbożowa 15, 33-444 Szczecin

         X     Adres oddziału w którym aktualnie się znajduje.
        | |
         O     Adres oddziału w którym przesyłka była wcześniej
        | |
         O     Adres oddziału w którym przesyłka była wcześniej
        | |
         O     Adres oddziału w którym przesyłka była wcześniej

Nadawca:       Księcia Bogusława X 10/4, 55-444 Szczecin


# *** III ETAP ROZWOJU *** #
Aktualnie system udostępnia wszystkie opcje dla każdego użytkownika. Zmodyfikuj go dodając konta użytkownika oraz role (np. Kurier, Magazynier itp.)
Na pierwszej stronie wyświetl w menu tylko 2 opcje:

1. Śledź przesyłkę
2. Zaloguj się

Śledzenie przesyłki może odbywać się bez logowania ponieważ nie wykonywane są tam żadne operacje.
Jeśli użytkownik zaloguje się jako Kurier powinien mieć dostęp do funkcji:

1. Nadaj przesyłkę (po nadaniu przesyłki zapisz także informację o kurierze który ją nadał).
2. Wydaj przesyłkę (po wydaniu przesyłki zapisz także informację o kurierze który ją wydał). 

Jeśli jest Magazynierem możliwe jest tylko wykonanie:

1. Przekaż przesyłkę do innej lokalizacji

Dodaj prostą implementację sesji aby możliwe było przechowywanie informacji o zalogowanym użytkowniku.

# *** III ETAP ROZWOJU *** #
Kurierzy oraz magazynierzy chcieliby mieć możliwość przeszukiwania bazy danych pod kątek paczek. Dodaj więc mechanizmy które pozwolą im znaleźć paczki. 

1. Znajdź paczkę po imieniu lub nazwisku odbiorcy.
2. Znajdź paczki po adresie odbiorcy.
3. Znajdź paczki po statusie (np. zakończone, rozpoczęte itp). 
4. Znajdź paczki w siedzibie firmy (wyświetl tylko te które mają status przetwarzanie).
5. Znajdź paczki nadane w konkretnym dniu. 
6. Znajdź paczki nadane do konkretnego miasta.

# *** IV ETAP ROZWOJU *** #
Dodaj kolejny rodzaj konta Manager. Osoby takie chcą mieć dostęp do informacji:

1. Statystyki dotyczące nadawania paczek:
    1. Ile paczek nadano łącznie.
    2. Ile paczek nadano w danym dniu.
    3. Ile paczek wydano łącznie.
    4. Ile paczek wydano w danym dniu.
    5. Ile paczek jest aktualnie w trakcie przetwarzania. 
2. Statystyki kurierów:
    1. Znajdź paczki nadane przez kuriera X.
    2. Znajdź paczki wydane przez kuriera X.
    3. Lista 3 najlepszych kurierów którzy wydali największą liczbę paczek.
    4. Lista 3 najgorszych kurierów którzy wydali najmniejszą liczbę paczek.
 