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
}
