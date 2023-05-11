package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.stepDefinitions.Calisma02;
import techproed.utilities.Driver;

public class CalismaPage {
    public CalismaPage (){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(name = "q")
    public WebElement search;
}
