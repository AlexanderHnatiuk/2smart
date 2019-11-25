package tooSmart;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import tooSmart.Driver.Driver;
import tooSmart.Driver.ObjectManager;
import tooSmart.PageObject.Steps.LoginSteps;

public class BaseTest {
    public ObjectManager objectManager;
    public Driver driver;
    public LoginSteps steps;
    protected static String ADMIN_URL_LOCAL = "http://localhost:3000/admin";
    protected static String DASHBOARD_URL_LOCAL = "http://localhost:3000/admin/dashboard";

    @BeforeMethod
    public void SetUp(){
        objectManager = new ObjectManager();
        driver = objectManager.getDriver();
        steps = objectManager.getLoginSteps();
    }

    @AfterMethod
    public void ThrowDown(){
        driver.quit();
    }
}
