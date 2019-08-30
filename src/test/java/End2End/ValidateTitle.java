package End2End;

import End2End.PageObjects.LandingPage;
import End2End.PageObjects.LoginPage;
import End2End.Resources.Base;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class ValidateTitle extends Base {

    @Test
    public void basePageNavigation() throws IOException {

        driver = InitializeDriver();
        driver.get("http://www.rediff.com/");

        LandingPage lp = new LandingPage(driver);

        //Compare the text from the browser with actual text
        Assert.assertEquals(driver.getTitle(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
        driver.quit();

    }

}
