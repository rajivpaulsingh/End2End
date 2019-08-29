package End2End.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }

    By signin = By.cssSelector("a[class='signin']");

    By email = By.id("login1");

    By password = By.id("password");

    By login = By.name("proceed");



    public WebElement getLogin() {
        return driver.findElement(signin);
    }

    public WebElement getEmail() {
        return driver.findElement(email);
    }

    public WebElement getPassword() {
        return driver.findElement(password);
    }

    public WebElement clickLogin() {
        return driver.findElement(login);
    }

}
