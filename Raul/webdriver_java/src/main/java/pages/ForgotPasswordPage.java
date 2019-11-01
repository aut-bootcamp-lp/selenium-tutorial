package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;
    private By emailField = By.id("email");
    private By retriveButton = By.cssSelector("#content button");

    public ForgotPasswordPage(WebDriver driver){
        this.driver=driver;
    }
    public void setEmailField(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public RetriveMessagePage clickRetriveButton(){
        driver.findElement(retriveButton).click();
        return new RetriveMessagePage(driver);
    }
}
