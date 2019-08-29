package End2End;

import org.testng.annotations.Test;

import java.io.IOException;

public class HomePage extends Base{

    @Test
    public void BasePageNavigation() throws IOException {

        driver = InitializeDriver();
        driver.get("http://www.google.com");

    }
}
