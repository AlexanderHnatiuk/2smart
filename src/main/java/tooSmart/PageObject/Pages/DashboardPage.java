package tooSmart.PageObject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tooSmart.Driver.Driver;

public class DashboardPage {
    public Driver driver;

    public DashboardPage(Driver driver){
        this.driver = driver;
        PageFactory.initElements(driver.getWebDriver(),this);
    }

    @FindBy(xpath = "//p[contains(text(),'dashboard')]")
    public WebElement DashboardButt;

    @FindBy(xpath = "//p[contains(text(),'settings')]")
    public WebElement SettingButt;

//    ----------------------------------------------LogOut Form-----------------------------------------------------------------------------

    @FindBy(xpath = "//i[@class='src-components-base-Icon__Icon--2FX8f src-components-base-Icon__logout--1pJNE src-components-base-Icon__clickable--3HzrH src-components-layouts-admin-Header__logoutIco--1H74y']")
    public WebElement LogOutButt;

    @FindBy(xpath = "//button[@class='src-components-base-Button__Button--3B734 src-components-pages-admin-ConfirmModal__buttonConfirm--2PHP2']")
    public WebElement ConfirmLogOutButt;

    @FindBy(xpath = "//button[@class='src-components-base-Button__Button--3B734 src-components-pages-admin-ConfirmModal__buttonCancel--3Albh']")
    public WebElement CancelLogoutButt;

    @FindBy(xpath = "//div[@class='src-components-pages-admin-ConfirmModal__title--3H8jU']")
    public WebElement LogOutText;

}
