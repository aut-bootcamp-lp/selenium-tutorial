package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword {

    private WebDriver driver;
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.cssSelector(".radius");

    public ForgotPassword(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public EmailSended clickInRetrievePasswordButton(){
        driver.findElement(retrievePasswordButton).click();
        return new EmailSended(driver);
    }
}
