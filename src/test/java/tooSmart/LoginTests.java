package tooSmart;

import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tooSmart.Listeners.Listener;


@Listeners(tooSmart.Listeners.Listener.class)
@Epic("Проверка страницы логина")
@Feature("Страница логина")
public class LoginTests extends BaseTest {

    @Test (priority = 4)
    @Severity(SeverityLevel.BLOCKER)
    @Description("Логин с валидными данными")
    public void loginSuccessfull(){
        steps
                .open(ADMIN_URL_LOCAL)
                .loginAs("admin","111111");
    }

    @Test (priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Логин с пустыми полями Login и Password:")
    public void loginEmpty(){
        steps
                .open(ADMIN_URL_LOCAL)
                .login("","")
                .asserts().loginErrors("login is required","password is required");
    }

    @Test (priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Логин с невалидными Login и Password:")
    public void loginWithInvalidLoginAndPass(){
        steps
                .open(ADMIN_URL_LOCAL)
                .login("Invalid","123456")
                .asserts().assertsErrorField("The values you entered are incorrect")
                .loginErrorsStyle(true);
    }

    @Test (priority = 3)
    @Severity(SeverityLevel.MINOR)
    @Description("Логин с помощью клавиш Tab и Enter:")
    public void loginWithTabAndEnter(){
        steps
                .open(ADMIN_URL_LOCAL)
                .loginWithTabAndEnter("admin","111111");
    }

    @Test (priority = 5)
    @Severity(SeverityLevel.NORMAL)
    @Description("Логаут: ")
    public void logout(){
        steps.open(ADMIN_URL_LOCAL)
                .loginAs("admin","111111")
                .logOut();
    }

//    @Test (priority = 3)
//    @Severity(SeverityLevel.MINOR)
//    @Description("Логин с помощью клавиш Tab и Enter:")
//    public void loginWithрTabAndEnter(){
//        steps
//                .open(ADMIN_URL_LOCAL);
//        try {
//            Runtime.getRuntime().exec("nmcli networking off");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        objectManager.getWait().waitForElementVisibility(10,driver.getWebDriver().findElement(By.xpath("//div[@class='src-components-base-toast-ToastContent__message--1dtvy']")));
//
//                steps.loginWithTabAndEnter("admin","111111");
//                try {
//            Runtime.getRuntime().exec("nmcli networking on");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        objectManager.getWait().getWait().until(ExpectedConditions.invisibilityOf(driver.getWebDriver().findElement(By.xpath("//div[@class='src-components-base-toast-ToastContent__message--1dtvy']"))));
//    }
}
