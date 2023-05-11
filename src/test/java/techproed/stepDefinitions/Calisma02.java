package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.CalismaPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class Calisma02 {
    CalismaPage calismaPage=new CalismaPage();



    @Given("kullanici {string} gider")
    public void kullaniciGider(String url) {
        Driver.getDriver().get(url);
    }
    @Then("kullanici {string} aratir")
    public void kullaniciAratir(String aranacak) {
        calismaPage.search.sendKeys(aranacak+ Keys.ENTER);

    }

    @And("kullanici {string} kelime içerdiğini doğrular")
    public void kullaniciKelimeIcerdiginiDogrular(String getTitle) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(getTitle));

    }

    @And("kullanci sayfayi kapatir")
    public void kullanciSayfayiKapatir() {
        Driver.closeDriver();
    }



}
