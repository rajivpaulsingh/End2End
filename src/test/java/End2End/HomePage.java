package End2End;

import End2End.PageObjects.LandingPage;
import End2End.Resources.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void BasePageNavigation() throws IOException {

        driver = InitializeDriver();
        driver.get("http://www.rediff.com/");

        LandingPage lp = new LandingPage(driver);
        lp.getLogin().click();
        lp.getEmail().sendKeys("abc");
        lp.getPassword().sendKeys("abc");
        lp.clickLogin().click();

    }

}
