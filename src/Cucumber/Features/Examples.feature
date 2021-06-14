Feature: Examples

 Scenario Outline: Użytkownik wypełnia formularz New address
  #Given jest warunkiem wstępnym do przeprowadzenia testu
  Given Uzytkownik jest na stronie formularza
  And Uzytkownik istnieje w bazie danych
  When Uzytkownik wprowadza my "<alias>" w rubryce alias
  And Uzytkownik wprowadza my "<address>" w rubyce address
  And Uzytkownik wprowadza my "<city>" w rubryce city
  And Uzytkownik wprowadza my "<zip>" w rubryce zip/postalcode
  And Uzytkownik wprowadza my "<country>" w rubryce Counrty
  And Uztkownik wprowadza my "<phone>" w rybryce Phone
  And Uzytkownik klika przycisk save
  And Uzytkownik kilka przycisk Update
  And Sprawdza poprawnosc poprawność zapisanego adresu
  Then Zamyka strone

  Examples:
   |alias|address         |city        |zip    |country|phone    |
   |Kamis|Lipowa 4        |Siemianowice|41-100 |United Kingdom |515796945|
   |Rutko|Wycieczkowa 125 |Łódź        |91-614 |United Kingdom |608318423|
   |Borko|Dunikowskiego 36|Bydgoszcz   |85-863 |United Kingdom |609363923|
