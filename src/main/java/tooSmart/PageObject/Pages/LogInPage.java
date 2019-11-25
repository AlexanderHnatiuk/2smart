package tooSmart.PageObject.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tooSmart.Driver.Driver;

public class LogInPage {
    public Driver driver;

    public LogInPage (Driver driver){
        this.driver = driver;
        PageFactory.initElements(driver.getWebDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement LoginInput;

    @FindBy(xpath = "//div[@class='src-components-pages-admin-LoginPage__inputConatiner--1Cvhu']//div[2]//div[1]")
    public WebElement LoginStyle;

    @FindBy(xpath ="//div[@class='src-components-pages-admin-LoginPage__inputConatiner--1Cvhu']//div[1]//div[1]")
    public WebElement PassStyle;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement PassInput;

    @FindBy(xpath = "//button[@class='src-components-base-Button__Button--3B734 src-components-pages-admin-LoginPage__saveButton--22JtA']")
    public WebElement SignInButt;

    @FindBy(xpath = "//i[@class='src-components-base-Icon__Icon--2FX8f src-components-base-Icon__logo--3o1ct']")
    public WebElement Logo;

    @FindBy(xpath = "//div[@class='src-components-pages-admin-LoginPage__inputsContainer--3XXH4']//div[1]//div[2]//following::div[1]")
    public WebElement loginError;

    @FindBy(xpath = "//body[@class='stopBouncing']/div[@id='root']/div[@class='src-components-layouts-MainLayout__MainLayout--1QVsA']/div[@class='src-components-pages-admin-LoginPage__LoginPage--2x0HM']/div[@class='src-components-pages-admin-LoginPage__inputsContainer--3XXH4']/form[@class='src-components-pages-admin-LoginPage__form--3VawE']/div[2]")
    public WebElement passError;
}
