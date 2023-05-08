package techproed.stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import static org.junit.Assert.assertTrue;

public class GoogleStepDefinition {
    GooglePage googlePage = new GooglePage();

    @Given("kullanici_google_anasayfaya_gider")
    public void kullanici_google_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_Url"));
    }

    @When("kullanici googleda {string} aratir")
    public void kullanici_googleda_aratir(String aranacakKelime) {
        googlePage.aramaKutusu.sendKeys(aranacakKelime + Keys.ENTER);
    }

    @Then("title'in {string} icerdigini dogrular")
    public void title_in_icerdigini_dogrular(String titleDegeri) {

        assertTrue(Driver.getDriver().getTitle().contains(titleDegeri));

    }

}