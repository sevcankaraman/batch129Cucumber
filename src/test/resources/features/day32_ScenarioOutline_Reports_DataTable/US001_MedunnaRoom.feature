@MedunnaRoom
Feature: Medunna Oda olusturma

  Background: Admin olarak giris yap
    Given "https://www.medunna.com/" adresine git
    When kullanici simgesini tikla
    And sign in secenegini tikla
    And username kutusuna "mark_twain" gir
    And password kutusuna "Mark.123" gir
    And remember me radio butonuna tikla
    And sign in butonuna tikla

  Scenario Outline: Oda olustur
    When items&titles sekmesini tikla
    And room secenegini tikla
    And create a new room butonunu tikla
    And room number kutusuna "<roomNumber>" gir
    And Room Type drop downdan "<Room Type>" sec
    And price kutusuna "<price>" gir
    And description kutusuna "<description>" gir
    And save butonunu tikla
    Then kaydedildi alertini dogrula
    And sayfayi_kapatir
    Examples:
      | roomNumber | Room Type | price | description |
      | 33333      | SUITE     | 500   | temiz oda   |
      | 11118      | DELUXE    | 400   | lux oda     |
      | 22222      | TWIN      | 300   | kucuk oda   |




