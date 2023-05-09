@GoogleSearch
Feature: Google_Search

  Background: kullanici_google_anasayfaya_gider
    Given kullanici_google_anasayfaya_gider

     #sadece tırnak içine aldıgımızda parametrelendırmıs oluyoruz.
    # tırnak için değiştirdiğimizde arama kısmında baska bır arama yaptrımıs oluyoruz
    #bu kısım action kısmıdır.sadece java aratmak için

  #Feature file'da birden fazla ürün aratmak için her ürün için yeni bir method oluşturmak gerekir.
  #Dolayısıyla stepdefinition class'ında çok fazla method oluşturmuş oluruz.
  #Tek bir parametreli method oluşturup bunun üstesinden gelebiliriz.
    #Bunun için feature file'da aratmak istediğim metni " " tırnak içinde yazarsak stepdefinition class'ında bize
  #parametreli method oluşturur. Böylece bu methodu kullanarak istediğimiz kadar metin aratabiliriz

  Scenario: TC01_Java_Search
    When kullanici googleda "Java" aratir
    Then title'in "Java" icerdigini dogrular
    And sayfayi_kapatir

  Scenario: TC02_Sql_Search
    When kullanici googleda "Sql" aratir
    Then title'in "Sql" icerdigini dogrular
    And sayfayi_kapatir

  Scenario: TC03_JDBC_Search
    When kullanici googleda "JDBC" aratir
    Then title'in "JDBC" icerdigini dogrular
    And sayfayi_kapatir

  Scenario: TC04_Selenium_Search
    When kullanici googleda "Selenium" aratir
    Then title'in "Selenium" icerdigini dogrular
    And sayfayi_kapatir

  Scenario: TC05_Lambda_Search
    When kullanici googleda "Lambda" aratir
    Then title'in "Lambda" icerdigini dogrular
    And sayfayi_kapatir

