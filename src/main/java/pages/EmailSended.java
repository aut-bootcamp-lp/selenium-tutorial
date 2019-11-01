package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmailSended {

    private WebDriver driver;
    private By emailSended = By.id("content");

    public EmailSended(WebDriver driver) {
        this.driver = driver;
    }

    public String emailSended(){
        return driver.findElement(emailSended).getText();
    }
}
