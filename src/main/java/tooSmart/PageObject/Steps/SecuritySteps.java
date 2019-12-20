package tooSmart.PageObject.Steps;

import io.qameta.allure.Step;
import tooSmart.Driver.Driver;

public class SecuritySteps extends BaseSteps {
    public Driver driver;
    public SecuritySteps(Driver driver){
        this.driver = driver;
    }

    @Step("Сабмит формы с PIN паролями")
    public SecuritySteps submitPinForm(String Pin, String ConfirmPin ){
        objectManager.getSecurityPage().InputPIN.sendKeys(Pin);
        objectManager.getSecurityPage().InputConfirmPIN.sendKeys(ConfirmPin);
        objectManager.getSecurityPage().SaveButt.click();
        return this;
    }
}
