package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShowWithPasswordPage {
    private WebDriver driver;
    private By userPasswordField = By.id("credentials_password");
    private By nextActionBtn = By.name("action");

    public ShowWithPasswordPage(WebDriver driver) {
        this.driver = driver;

    }

    public void setUserPasswordField(String password) {
        driver.findElement(userPasswordField).sendKeys(password);
    }

    public String getPasswUrl() {
        return driver.getCurrentUrl();
    }

}
