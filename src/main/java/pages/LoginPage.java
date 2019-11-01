package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By userNameField = By.id("credentials_username");
    private By nextActionBtn = By.name("action");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserNameField(String username) {
        driver.findElement(userNameField).sendKeys(username);
    }


    public ShowWithPasswordPage clickNextBtn() {
        driver.findElement(nextActionBtn).click();
        return new ShowWithPasswordPage(driver);
    }

}
