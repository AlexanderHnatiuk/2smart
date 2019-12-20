package tooSmart.Listeners;

import io.qameta.allure.Attachment;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tooSmart.BaseTest;




public class Listener implements ITestListener {

    @Attachment(value = "Page screenshot", type = "image/png")
    private byte[] makeScreenshot(ITestResult iTestResult) {
        WebDriver driver = ((BaseTest) iTestResult.getInstance()).objectManager.getDriver().getWebDriver();
        TakesScreenshot scr = ((TakesScreenshot) driver);
        return scr.getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("TEST SUCCESS");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("TEST FAILER");
        makeScreenshot(iTestResult);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
