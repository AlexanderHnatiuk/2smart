package tooSmart.Driver;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class Screenshot {
    public Driver driver;

    public Screenshot(Driver driver){
              this.driver = driver;
    }

    public void takeScreenshot(){
        File scrFile = ((TakesScreenshot)driver.getWebDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile, new File("/screenshots/image.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
