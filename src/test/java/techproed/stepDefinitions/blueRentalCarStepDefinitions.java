package techproed.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import techproed.pages.BlueRentalCarPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class blueRentalCarStepDefinitions {
    BlueRentalCarPage blueRentalCarPage = new BlueRentalCarPage();
    @Given("kullanici blue rental car sayfasini gider")
    public void kullanici_blue_rental_car_sayfasini_gider() {

        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));

    }
    @When("login olur")
    public void login_olur(DataTable dataTable) throws InterruptedException {

        blueRentalCarPage.loginButton.click();
        blueRentalCarPage.emailBox.sendKeys(dataTable.row(1).get(0));//2. satırın ilk ve ikinci sütunlarını kullamıyoruz
        blueRentalCarPage.passwordBox.sendKeys(dataTable.row(1).get(1));
        blueRentalCarPage.loginConfirm.click();

        //Çıkış yapıp diğer data ile giriş yapacağız
        blueRentalCarPage.userDropDown.click();
        blueRentalCarPage.logOut.click();
        blueRentalCarPage.OK.click();

        //giriş işlemlerini tekrarlıyorum
        blueRentalCarPage.loginButton.click();
        blueRentalCarPage.emailBox.sendKeys(dataTable.row(2).get(0));//3. satırın ilk ve ikinci sütunlarını kullamıyoruz
        blueRentalCarPage.passwordBox.sendKeys(dataTable.row(2).get(1));
        blueRentalCarPage.loginConfirm.click();
        Thread.sleep(3000);


    }

    @When("login olur map")
    public void loginOlurMap(DataTable dataTable) {
        System.out.println(dataTable.asMaps().get(0).get("emailadress"));
    }
}