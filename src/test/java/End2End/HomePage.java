package End2End;

import End2End.PageObjects.LandingPage;
import End2End.Resources.Base;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {

    @Test
    public void BasePageNavigation() throws IOException {

        driver = InitializeDriver();
        driver.get("http://www.qaclickacademy.com/");

        LandingPage lp = new LandingPage(driver);

        if (lp.joinNewsletter().isDisplayed()) {
            lp.joinNewsletter().click();
        }
        lp.getLogin().click();

    }
}
