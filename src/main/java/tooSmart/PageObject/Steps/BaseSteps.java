package tooSmart.PageObject.Steps;

import org.apache.log4j.Logger;
import tooSmart.Driver.Asserts;
import tooSmart.Driver.Driver;
import tooSmart.Driver.ObjectManager;
import tooSmart.PageObject.Pages.DashboardPage;

public class BaseSteps {
    public Driver driver;
    public ObjectManager objectManager;
    public Logger logs;
    public DashboardPage dashboardPage;

    public Asserts asserts() {
        return objectManager.getAsserts();
    }

    public DashboardPage getDashboardPage() {return objectManager.getDashboardPage();}




}
