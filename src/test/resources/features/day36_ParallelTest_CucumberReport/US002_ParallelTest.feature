Feature: US002_Parallel_Test
@techpro3
Scenario: TC02_TechProEducation_Sayfasi_Testi
Given kullanici_"https://techproeducation.com"_sayfasina_gider
Then cikan_reklam_kapatilir
When kullanici 2 saniye bekler
And searchBoxda_"phyton"_aratir