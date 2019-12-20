package tooSmart.Driver;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class Asserts {
    private Driver driver;
    private ObjectManager objectManager;

    public Asserts(Driver driver, ObjectManager objectManager){
        this.driver = driver;
        this.objectManager = objectManager;
    }


    @Step("Проверка текста елемента")
    public Asserts assertsErrorField(String error){
        Assert.assertEquals(error,driver.getWebDriver().findElement(By.xpath("//div[contains(text(),'" + error +"')]")).getText());
        return this;
    }

    @Step("Проверка на true")
    public Asserts assertTrue(boolean condition) {
        Assert.assertTrue(condition);
        return this;
    }

    @Step("Проверка на false")
    public Asserts assertFalse(boolean condition) {
        Assert.assertFalse(condition);
        return this;
    }

    @Step("Проверка текста ошибки Login и Pass")
    public Asserts loginErrors(String login, String pass){
        Assert.assertEquals(login,driver.getWebDriver().findElement(By.xpath("//div[contains(text(),'" + login +"')]")).getText());
        Assert.assertEquals(pass,driver.getWebDriver().findElement(By.xpath("//div[contains(text(),'" + pass +"')]")).getText());
        return this;
    }

    @Step("Проверка стилей полей Login и Password")
    public Asserts loginErrorsStyle(boolean condition){
        Assert.assertEquals(condition,objectManager.getLogInPage().LoginStyle.getAttribute("class").contains("invalid"));
        Assert.assertEquals(condition,objectManager.getLogInPage().PassStyle.getAttribute("class").contains("invalid"));
        return this;
    }


}
