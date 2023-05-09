package techproed.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import techproed.pages.MedunnaPage;
import techproed.utilities.Driver;

public class MedunnaStepDefinition {
    MedunnaPage medunnaPage=new MedunnaPage();
    @Given("{string} adresine git")
    public void adresine_git(String url) {
        Driver.getDriver().get(url);

    }
    @When("kullanici simgesine tikla")
    public void kullanici_simgesine_tikla() {

    }
    @When("sign in seceneğini tikla")
    public void sign_in_seceneğini_tikla() {

    }
    @When("username kutusuna {string} gir")
    public void username_kutusuna_gir(String string) {

    }
    @When("password kutusuna  {string} gir")
    public void password_kutusuna_gir(String string) {

    }
    @When("remember me radio butonuna tikla")
    public void remember_me_radio_butonuna_tikla() {

    }
    @When("sign in butonuna  tikla")
    public void sign_in_butonuna_tikla() {

    }
    @When("items&titles sekmesini tikla")
    public void items_titles_sekmesini_tikla() {

    }
    @When("room secenegini tikla")
    public void room_secenegini_tikla() {

    }
    @When("create a new room butonunu tıkla")
    public void create_a_new_room_butonunu_tıkla() {

    }
    @When("room number kutusuna  gir\"{int}\"")
    public void room_number_kutusuna_gir(Integer int1) {

    }
    @When("Room Type drop downdan {string} sec")
    public void room_type_drop_downdan_sec(String string) {

    }
    @When("price kutusuna {string} gir")
    public void price_kutusuna_gir(String string) {

    }
    @When("description kutusuna {string} gir")
    public void description_kutusuna_gir(String string) {

    }
    @When("save butonuna tikla")
    public void save_butonuna_tikla() {

    }
    @Then("kaydedildi alertini dogrula")
    public void kaydedildi_alertini_dogrula() {

    }

}
