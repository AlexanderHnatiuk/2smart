package tooSmart.Driver;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
    Driver driver;
    WebDriverWait wait;
    Logger logs;

    public Wait(Driver driver){
        this.driver = driver;
    }

    public void waitForClickable(int seconds, By locator){
        try {
            new WebDriverWait(driver.getWebDriver(), seconds).until(ExpectedConditions.elementToBeClickable(locator));
        } catch (RuntimeException e) {
            logs.error(e);
            throw e;
        }
    }


    public void waitForElementVisibility(int second, WebElement element) {
        try {
            new WebDriverWait(driver.getWebDriver(),second).until(ExpectedConditions.visibilityOf(element));
        } catch (TimeoutException e){
            logs.error(e);
            throw e;
        }
    }
}
