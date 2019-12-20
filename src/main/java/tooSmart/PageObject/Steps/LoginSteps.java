package tooSmart.PageObject.Steps;

import io.qameta.allure.Step;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import tooSmart.Driver.Driver;
import tooSmart.Driver.ObjectManager;
import tooSmart.PageObject.Pages.DashboardPage;



public class LoginSteps extends BaseSteps{

    public LoginSteps(Driver driver, ObjectManager objectManager) {
        this.driver = driver;
        this.objectManager = objectManager;
        logs = Logger.getLogger(this.getClass().getName());
    }

    @Step("Заходим на страницу: {url}")
    public LoginSteps open(String url) {
        driver.get(url);
        return this;
    }

    @Step("Попробовать залогинится: {login}, {pass}")
    public LoginSteps login(String login, String pass){
        try {
            objectManager.getLogInPage().LoginInput.sendKeys(login);
            objectManager.getLogInPage().PassInput.sendKeys(pass);
            objectManager.getLogInPage().SignInButt.click();
        } catch (RuntimeException e) {
            logs.error(e);
            throw e;
        }
        return this;
    }

    @Step("Залогинится: {login}, {pass}")
    public DashboardSteps loginAs(String login, String pass){
        try {
            objectManager.getLogInPage().LoginInput.sendKeys(login);
            objectManager.getLogInPage().PassInput.sendKeys(pass);
            objectManager.getLogInPage().SignInButt.click();
        } catch (RuntimeException e) {
            logs.error(e);
            throw e;
        }
        try {
            asserts().assertTrue(objectManager.getDashboardPage().DashboardButt.isDisplayed());
        } catch (RuntimeException e){
            logs.error("Не отображается сайд бар на странице Dashboard");
        }
        return getDashboardSteps();
    }



    @Step("Логин с пустыми полями:")
    public LoginSteps loginEmpty(){
        try {
            objectManager.getLogInPage().SignInButt.click();
        } catch (RuntimeException e){
            logs.error(e);
            throw e;
        }
        return this;
    }

    @Step("Логин c помощью клавишей Tab и Enter")
    public DashboardSteps loginWithTabAndEnter(String login, String pass){
        try {
            objectManager.getLogInPage().LoginInput.sendKeys(login);
            objectManager.getLogInPage().LoginInput.sendKeys(Keys.TAB);
            objectManager.getLogInPage().PassInput.sendKeys(pass);
            objectManager.getLogInPage().PassInput.sendKeys(Keys.ENTER);
        } catch (RuntimeException e) {
            logs.error(e);
            throw e;
        }
        try {
            asserts().assertTrue(objectManager.getDashboardPage().DashboardButt.isDisplayed());
        } catch (RuntimeException e){
            logs.error("Не отображается сайд бар на странице Dashboard");
        }
        return getDashboardSteps();
        }


}
