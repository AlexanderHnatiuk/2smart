package tooSmart.Driver;


import tooSmart.PageObject.Pages.DashboardPage;
import tooSmart.PageObject.Pages.LogInPage;
import tooSmart.PageObject.Steps.LoginSteps;

public class ObjectManager {

    private Driver driver;
    private LoginSteps loginSteps;
    private LogInPage logInPage;
    private Asserts asserts;
    private DashboardPage dashboardPage;
    private Wait wait;
    private Screenshot screenshot;

    public ObjectManager(){
        driver = new Driver();
    }

    public Driver getDriver(){ return driver; }

    public LoginSteps getLoginSteps(){ return (loginSteps == null) ? loginSteps = new LoginSteps(driver,this) : loginSteps; }
    public LogInPage getLogInPage(){ return (logInPage == null) ? logInPage = new LogInPage(driver) : logInPage; }
    public Asserts getAsserts(){ return (asserts == null) ? asserts = new Asserts(driver, this) : asserts; }
    public DashboardPage getDashboardPage(){ return  (dashboardPage == null) ? dashboardPage = new DashboardPage(driver) : dashboardPage; }
    public Wait getWait(){ return (wait == null) ? wait = new Wait(driver): wait; }
    public Screenshot getScreenshot(){ return (screenshot == null) ? screenshot = new Screenshot(driver): screenshot;}

}
