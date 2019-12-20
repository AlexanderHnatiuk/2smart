package tooSmart.Driver;


import org.apache.log4j.Logger;
import tooSmart.PageObject.Pages.DashboardPage;
import tooSmart.PageObject.Pages.LogInPage;
import tooSmart.PageObject.Pages.Settings.PreferencesPage;
import tooSmart.PageObject.Steps.DashboardSteps;
import tooSmart.PageObject.Steps.LoginSteps;
import tooSmart.PageObject.Steps.PreferencesSteps;
import tooSmart.PageObject.Steps.SecuritySteps;

public class ObjectManager {

    private Driver driver;
    private LoginSteps loginSteps;
    private LogInPage logInPage;
    private Asserts asserts;
    private DashboardPage dashboardPage;
    private Wait wait;
    private DashboardSteps dashboardSteps;
    private PreferencesSteps preferencesSteps;
    private PreferencesPage preferencesPage;
    private SecuritySteps securitySteps;



    public ObjectManager(){
        driver = new Driver();
    }

    public Driver getDriver(){ return driver; }

    public LoginSteps getLoginSteps(){ return (loginSteps == null) ? loginSteps = new LoginSteps(driver,this) : loginSteps; }
    public DashboardSteps getDashboardSteps(){ return (dashboardSteps == null) ? dashboardSteps = new DashboardSteps(driver, this): dashboardSteps;}
    public PreferencesSteps getPreferencesSteps(){ return (preferencesSteps == null) ? preferencesSteps = new PreferencesSteps(driver): preferencesSteps; }
    public SecuritySteps getSecuritySteps(){ return (securitySteps == null) ? securitySteps = new SecuritySteps(driver) : securitySteps;}

    public LogInPage getLogInPage(){ return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage; }
    public Asserts getAsserts(){ return (asserts == null) ? asserts = new Asserts(driver, this) : asserts; }
    public DashboardPage getDashboardPage(){ return  (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage; }
    public Wait getWait(){ return (wait == null) ? wait = new Wait(driver): wait; }
    public PreferencesPage getPreferencesPage(){return (preferencesPage == null) ? preferencesPage= new PreferencesPage(driver) : preferencesPage;}


}
