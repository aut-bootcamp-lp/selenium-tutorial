package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver driver;
    private By userName = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.cssSelector("#login button");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String username) {
      driver.findElement(userName).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
}
