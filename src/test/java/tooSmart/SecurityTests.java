package tooSmart;


import io.qameta.allure.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import tooSmart.PageObject.Steps.BaseSteps;

@Listeners(tooSmart.Listeners.Listener.class)
@Epic("Проверка страницы настроек Security")
@Feature("Страница настроек Security")

public class SecurityTests extends BaseTest {

    @Test (priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Изменение пин кода с валидными данными")
    public void changePIN(){
        steps.loginAs("admin","111111")
                .clickSettings()
                .clickSecurityButt()
                .submitPinForm("111111", "111111");

    }



}
