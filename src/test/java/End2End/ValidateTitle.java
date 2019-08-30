package End2End;

import End2End.PageObjects.LandingPage;
import End2End.Resources.Base;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ValidateTitle extends Base {

    public static Logger log = LogManager.getLogger(Base.class.getName());

    @BeforeTest
    public void setup() throws IOException {
        driver = InitializeDriver();
        log.info("Driver is initialized");

        driver.get("http://www.rediff.com/");
        log.info("Navigated to home page");

    }

    @Test
    public void basePageNavigation() throws IOException {


        LandingPage lp = new LandingPage(driver);

        //Compare the text from the browser with actual text
        Assert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
        log.info("Successfully validated the title");


    }

    @AfterTest
    public void teardown() {
        driver.close();
        driver.quit();
        driver = null;
    }

}
