package tooSmart.PageObject.Pages.Settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tooSmart.Driver.Driver;

public class PreferencesPage {
    public Driver driver;
    public PreferencesPage(Driver driver){
        this.driver = driver;
        PageFactory.initElements(driver.getWebDriver(),this);
    }

    @FindBy(xpath = "//span[contains(text(),'security')]")
    public WebElement SecurityButt;
}
