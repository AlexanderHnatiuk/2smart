package tooSmart.PageObject.Steps;

import io.qameta.allure.Step;
import tooSmart.Driver.Driver;
import tooSmart.Driver.ObjectManager;

import java.util.concurrent.TimeoutException;

public class DashboardSteps extends BaseSteps {

    public DashboardSteps(Driver driver, ObjectManager objectManager){
        this.driver = driver;
        this.objectManager = objectManager;
    }

    @Step("Перейти на страницу Settings")
    public PreferencesSteps clickSettings(){
        try {
            objectManager.getDashboardPage().SettingButt.click();
        } catch (RuntimeException e){
            logs.error(e);
            throw e;
        }
        return getPreferencesSteps();
    }

    @Step("Пользователь вылогиниваеться")
    public LoginSteps logOut(){
        try {
            objectManager.getDashboardPage().LogOutButt.click();
            objectManager.getDashboardPage().ConfirmLogOutButt.click();
            objectManager.getLogInPage().LoginInput.isDisplayed();
        }catch (RuntimeException e){
            logs.error("Елемент не найден");
            throw e;
        }
        return new LoginSteps(driver,objectManager);
    }
}
