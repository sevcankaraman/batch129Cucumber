package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.util.List;

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
    @Given("kullanici googleda {string} aratacaktir")
    public void kullanici_googleda_aratacaktir(String string) {
        googlePage=new GooglePage();
        googlePage.aramaKutusu.sendKeys(ConfigReader.getProperty(string), Keys.ENTER);
    }

    @Given("basligin {string} icerdigini dogrulayacaktir")
    public void basligin_icerdigini_dogrulayacaktir(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(ConfigReader.getProperty(string)));
    }
    @When("kullanici verilen bilgileri aratir")
    public void kullaniciverilenbilgileriaratir(DataTable dataTable) throws InterruptedException {

        List<String> aranacakBilgiler = dataTable.asList();//[Bilgiler, Java, SQL, Lambda, Python]

        for (int i=1; i<aranacakBilgiler.size(); i++){
            Thread.sleep(3000);

            googlePage.aramaKutusu.sendKeys(aranacakBilgiler.get(i)+Keys.ENTER);
            googlePage.aramaKutusu.clear();

        }

    }


}