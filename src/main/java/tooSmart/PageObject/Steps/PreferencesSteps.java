package tooSmart.PageObject.Steps;

import io.qameta.allure.Step;
import tooSmart.Driver.Driver;

public class PreferencesSteps extends BaseSteps {
    public Driver driver;
    public PreferencesSteps(Driver driver){
        this.driver = driver;
    }

    @Step("Перейти на вкладку Security")
    public SecuritySteps clickSecurityButt(){
        objectManager.getPreferencesPage().SecurityButt.click();
        return getSecuritySteps();
    }
}
