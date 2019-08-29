package End2End;

import End2End.PageObjects.LandingPage;
import End2End.PageObjects.LoginPage;
import End2End.Resources.Base;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base {

    @Test(dataProvider = "getData")
    public void basePageNavigation(String Username, String Password) throws IOException {

        driver = InitializeDriver();
        driver.get("http://www.rediff.com/");

        LandingPage lp = new LandingPage(driver);
        lp.getLogin().click();

        LoginPage login =  new LoginPage(driver);
        login.getEmail().sendKeys(Username);
        login.getPassword().sendKeys(Password);
        login.clickLogin().click();

        driver.close();

    }

    @DataProvider
    public Object[][] getData() {

        //Rows stand for how many different data types test should run
        //Columns stand for how many values per each test
        Object[][] data = new Object[2][2];

        //0th row
        data[0][0] = "ab@ab.com";
        data[0][1] = "1234";

        //1st row
        data[1][0] = "cd@cd.com";
        data[1][1] = "5678";

        return data;
    }
}
