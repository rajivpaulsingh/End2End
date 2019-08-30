package End2End.Resources;

//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public WebDriver InitializeDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("/Users/singh2_rajiv/Selenium/End2End/src/main/java/End2End/Resources/data.properties");
        prop.load(fis);
        String browserName = prop.getProperty("browser");
        System.out.println("Browser used: " + browserName);

        //Chrome browser
        if(browserName.equalsIgnoreCase("chrome")) {
            //execute in chrome driver
            System.setProperty("webdriver.chrome.driver", "/Users/singh2_rajiv/Automation/Selenium/Drivers/chromedriver");
            driver = new ChromeDriver();
        }

        //Firefox browser
        if(browserName.equalsIgnoreCase("firefox")) {
            //execute in chrome driver
            System.setProperty("webdriver.gecko.driver", "/Users/singh2_rajiv/Automation/Selenium/Drivers/firefoxdriver");
            driver = new FirefoxDriver();
        }

        //IE browser
        if(browserName.equalsIgnoreCase("ie")) {
            //execute in chrome driver
            System.setProperty("webdriver.ie.driver", "/Users/singh2_rajiv/Automation/Selenium/Drivers/iedriver");
            driver = new InternetExplorerDriver();
        }

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driver;
    }

    public void getScreenshot() throws IOException {

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(src, new File("/Users/singh2_rajiv/Automation/Selenium/screenshot.png"));

    }
}
