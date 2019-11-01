package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By logInBtn = By.linkText("Log in");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

//    public void clickLogInBtn() {
//        driver.findElement(logInBtn).click();
//    }

    public LoginPage clickLogInBtn() {
        driver.findElement(logInBtn).click();
        return new LoginPage(driver);
    }
}
