@Google
Feature: Google_Search

  Background: Kullanıcı Google Anasayfasina gider
    Given kullanici "http://google.com" gider

    Scenario Outline: Google aramalari
      Then kullanici "<aranacak>" aratir
      And kullanici "<aranacak>" kelime içerdiğini doğrular
      And kullanci sayfayi kapatir
      Examples:
        | aranacak   |
        | araba      |
        | bilgisayar |
        | mobilya    |




