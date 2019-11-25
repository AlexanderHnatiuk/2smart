package tooSmart.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

public class Driver {

    private WebDriver webDriver;
    private Logger logs;

    public Driver(){
        System.setProperty("webdriver.chrome.webDriver", "chromedriver");
        logs = Logger.getLogger(this.getClass().getName());
        logs.info("Open the browser: ");
        webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    public void get(String url){
        logs.info("Opening the page: " + url);
        try {
            webDriver.get(url);
        } catch (RuntimeException e){
            logs.error(e);
            throw e;
        }
    }

    public void quit(){
        logs.info("Closing driver");
        try {
            webDriver.quit();
        } catch (RuntimeException e){
            logs.error(e);
            throw e;
        }
    }
}
