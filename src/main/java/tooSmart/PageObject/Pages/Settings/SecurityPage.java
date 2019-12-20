package tooSmart.PageObject.Pages.Settings;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tooSmart.Driver.Driver;
import tooSmart.Driver.ObjectManager;

public class SecurityPage {
    public Driver driver;
    public ObjectManager objectManager;

    public SecurityPage(Driver driver, ObjectManager objectManager){
        this.driver = driver;
        this.objectManager = objectManager;
        PageFactory.initElements(driver.getWebDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Enter new PIN']")
    public WebElement InputPIN;

    @FindBy(xpath = "//input[@placeholder='Confirm new PIN']")
    public WebElement InputConfirmPIN;

    @FindBy(xpath = "//button[@class='src-components-base-Button__Button--3B734 src-components-pages-admin-Settings-Content-Security__submitButton--303TE']")
    public WebElement SaveButt;

}
