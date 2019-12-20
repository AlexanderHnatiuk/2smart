package tooSmart.PageObject.Steps;

import org.apache.log4j.Logger;
import tooSmart.Driver.Asserts;
import tooSmart.Driver.Driver;
import tooSmart.Driver.ObjectManager;

public class BaseSteps {
    public Driver driver;
    public ObjectManager objectManager;
    public Logger logs;

    public Asserts asserts() {
        return objectManager.getAsserts();
    }

    public DashboardSteps getDashboardSteps() {return objectManager.getDashboardSteps();}
    public PreferencesSteps getPreferencesSteps() {return objectManager.getPreferencesSteps();}
    public SecuritySteps getSecuritySteps() {return  objectManager.getSecuritySteps();}




}
